package vn.edu.iuh.fit.usermanagement.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.usermanagement.models.Product;
import vn.edu.iuh.fit.usermanagement.models.User;
import vn.edu.iuh.fit.usermanagement.services.UserService;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final RestTemplate restTemplate = new RestTemplate();
    @Override
    public User getUser(int id) {
        User user = new User(id, "User " + id);
        Product product = restTemplate.getForObject("http://localhost:8081/product/" + id, Product.class);
        user.setProduct(product);
        return user;
    }
}
