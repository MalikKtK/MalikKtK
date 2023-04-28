package com.example.vandeliveryv1.config;

import com.example.vandeliveryv1.model.Delivery;
import com.example.vandeliveryv1.model.Product;
import com.example.vandeliveryv1.model.ProductOrder;
import com.example.vandeliveryv1.repository.DeliveryRepository;
import com.example.vandeliveryv1.repository.ProductOrderRepository;
import com.example.vandeliveryv1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitData implements CommandLineRunner {
    private final boolean runTests = true;

    private final DeliveryRepository deliveryRepository;
    private final ProductOrderRepository productOrderRepository;
    private final ProductRepository productRepository;

    @Autowired
    public InitData(DeliveryRepository deliveryRepository,
                    ProductOrderRepository productOrderRepository,
                    ProductRepository productRepository) {
        this.deliveryRepository = deliveryRepository;
        this.productOrderRepository = productOrderRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (!runTests) return;
        product();
        delivery();
        productOrder();
    }

    public void product() {
        productRepository.save(new Product(
                1,
                "Æble",
                5.5,
                150));

        productRepository.save(new Product(
                2,
                "Banan",
                5.5,
                150));
    }

    public void delivery() {
        deliveryRepository.save(new Delivery(
                1,
                LocalDate.of(2023, 4, 25),
                "Warehouse 1",
                "Fyrrelunden 83, 2635 Ishøj"));
        deliveryRepository.save(new Delivery(
                2,
                LocalDate.of(2023, 4, 25),
                "Warehouse 1",
                "Fyrrelunden 83, 2635 Ishøj"));
    }

    public void productOrder() {
        productOrderRepository.save(new ProductOrder(
                1,
                10,
                productRepository.getReferenceById(1),
                deliveryRepository.getReferenceById(1)));
        productOrderRepository.save(new ProductOrder(
                2,
                10,
                productRepository.getReferenceById(2),
                deliveryRepository.getReferenceById(2)));
    }


}
