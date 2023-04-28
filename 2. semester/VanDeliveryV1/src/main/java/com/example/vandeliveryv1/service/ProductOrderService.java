package com.example.vandeliveryv1.service;

import com.example.vandeliveryv1.model.ProductOrder;
import com.example.vandeliveryv1.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductOrderService {

    @Autowired
    ProductOrderRepository productOrderRepository;

    public List<ProductOrder> getAllProductOrders() {
        return productOrderRepository.findAll();
    }

    public ProductOrder getProductOrderById(Integer id) {
        return productOrderRepository.findById(id).orElse(null);
    }

    public ProductOrder createProductOrder(ProductOrder productOrder) {
        return productOrderRepository.save(productOrder);
    }

    public ProductOrder updateProductOrder(Integer id, ProductOrder productOrder) {
        if (productOrderRepository.findById(id).isEmpty()) {
            return null;
        }
        return productOrderRepository.save(productOrder);
    }

    public void deleteProductOrder(Integer id) {
        productOrderRepository.deleteById(id);
    }
}
