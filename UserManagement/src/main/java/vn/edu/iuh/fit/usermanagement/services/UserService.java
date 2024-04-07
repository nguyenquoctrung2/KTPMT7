package vn.edu.iuh.fit.usermanagement.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.usermanagement.models.User;

@Service
public interface UserService {


    @Retryable(value = {RuntimeException.class}, maxAttempts = 3, backoff = @Backoff(delay = 15000))
    public User getUser(int id);
}
