package com.example.vandeliveryv1.controller;

import com.example.vandeliveryv1.model.Delivery;
import com.example.vandeliveryv1.model.ProductOrder;
import com.example.vandeliveryv1.repository.DeliveryRepository;
import com.example.vandeliveryv1.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @GetMapping("/deliveries")
    public List<Delivery> getAllDelivery() {
        return deliveryService.getAllDeliveries();
    }

    @GetMapping("/delivery/{id}")
    public ResponseEntity<Delivery> getDeliveryById(@PathVariable("id") Integer id) {
        Delivery delivery = deliveryService.getDeliveryById(id);
        return new ResponseEntity<>(delivery, HttpStatus.OK);
    }

    @PostMapping("/delivery")
    public ResponseEntity<Delivery> createDelivery(@RequestBody Delivery delivery) {
        Delivery newDelivery = deliveryService.createDelivery(delivery);
        return new ResponseEntity<>(newDelivery, HttpStatus.CREATED);
    }
    @PutMapping("/delivery/{id}")
    public ResponseEntity<Delivery> updateDelivery(@PathVariable("id") Integer id, @RequestBody Delivery delivery) {
        return new ResponseEntity<>(deliveryService.updateDelivery(id, delivery), HttpStatus.OK);
    }
    @DeleteMapping("/delivery/{id}")
    public ResponseEntity<Delivery> deleteDelivery(@PathVariable("id") Integer id) {
        deliveryService.deleteDelivery(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

