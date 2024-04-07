package vn.edu.iuh.fit.productmanagement.services.impl;

import vn.edu.iuh.fit.productmanagement.models.Product;
import vn.edu.iuh.fit.productmanagement.services.ProductService;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProduct(int id) {
        return new Product(id, "Product " + id);
    }
}
