package com.example.vandeliveryv1.repository;

import com.example.vandeliveryv1.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
}
