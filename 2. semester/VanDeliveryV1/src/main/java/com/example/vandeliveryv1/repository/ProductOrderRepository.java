package com.example.vandeliveryv1.repository;

import com.example.vandeliveryv1.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {

}
