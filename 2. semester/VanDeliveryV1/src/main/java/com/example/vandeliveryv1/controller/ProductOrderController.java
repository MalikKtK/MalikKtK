package com.example.vandeliveryv1.controller;

import com.example.vandeliveryv1.model.ProductOrder;
import com.example.vandeliveryv1.repository.ProductOrderRepository;
import com.example.vandeliveryv1.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@CrossOrigin(value = "*")
public class ProductOrderController {

    @Autowired
    ProductOrderService productOrderService;

    @GetMapping("/productOrders")
    public List<ProductOrder> getAllProductOrder() {
        return productOrderService.getAllProductOrders();
    }
    @GetMapping("/productOrder/{id}")
    public ResponseEntity<ProductOrder> getProductOrderById(@PathVariable("id") Integer id) {
        ProductOrder productOrder = productOrderService.getProductOrderById(id);
        return new ResponseEntity<>(productOrder, HttpStatus.OK);
    }
    @PostMapping("/productOrder")
    public ResponseEntity<ProductOrder> createProductOrder(@RequestBody ProductOrder productOrder) {
        ProductOrder newProductOrder = productOrderService.createProductOrder(productOrder);
        return new ResponseEntity<>(newProductOrder, HttpStatus.CREATED);
    }
    @PutMapping("/productOrder/{id}")
    public ResponseEntity<ProductOrder> updateProductOrder(@PathVariable("id") Integer id, @RequestBody ProductOrder productOrder) {
        return new ResponseEntity<>(productOrderService.updateProductOrder(id, productOrder), HttpStatus.OK);
    }
    @DeleteMapping("/productOrder/{id}")
    public ResponseEntity<ProductOrder> deleteProductOrder(@PathVariable("id") Integer id) {
        productOrderService.deleteProductOrder(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
