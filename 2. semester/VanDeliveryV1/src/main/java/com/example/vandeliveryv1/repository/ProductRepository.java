package com.example.vandeliveryv1.repository;

import com.example.vandeliveryv1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
