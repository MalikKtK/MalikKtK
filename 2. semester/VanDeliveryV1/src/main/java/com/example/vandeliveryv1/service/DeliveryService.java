package com.example.vandeliveryv1.service;

import com.example.vandeliveryv1.model.Delivery;
import com.example.vandeliveryv1.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository;

    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    public Delivery getDeliveryById(Integer id) {
        return deliveryRepository.findById(id).orElse(null);
    }

    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public Delivery updateDelivery(Integer id, Delivery delivery) {
        if (deliveryRepository.findById(id).isEmpty()) {
            return null;
        }
        return deliveryRepository.save(delivery);
    }

    public void deleteDelivery(Integer id) {
        deliveryRepository.deleteById(id);
    }
}
