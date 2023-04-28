package com.example.vandeliveryv1.service;

import com.example.vandeliveryv1.model.Product;
import com.example.vandeliveryv1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    public Product getProductById(Integer id) {

        return productRepository.findById(id).orElse(null);
    }

    public Product createProduct(Product product) {

        return productRepository.save(product);
    }

    public Product updateProduct(Integer id, Product product) {
        if (productRepository.findById(id).isEmpty()) {
            return null;
        }
        return productRepository.save(product);
    }

    public void deleteProduct(Integer id) {

        productRepository.deleteById(id);
    }
}