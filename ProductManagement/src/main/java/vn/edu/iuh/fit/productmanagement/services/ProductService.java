package vn.edu.iuh.fit.productmanagement.services;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.productmanagement.models.Product;

@Service
public interface ProductService {
    public Product getProduct(int id);
}
