package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(int id){
        return productRepository.getProduct(id);
    }


    public void saveProduct(Product product) {
        productRepository.saveProduct(product);
    }
}
