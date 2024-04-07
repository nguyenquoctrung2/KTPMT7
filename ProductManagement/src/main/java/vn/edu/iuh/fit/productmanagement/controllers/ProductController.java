package vn.edu.iuh.fit.productmanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.productmanagement.models.Product;

@RestController
public class ProductController {

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        return new Product(id, "Product " + id);
    }
}
