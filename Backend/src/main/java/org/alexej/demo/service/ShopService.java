package org.alexej.demo.service;

import org.alexej.demo.repository.Product;
import org.alexej.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class ShopService {


    private final ProductRepository userRepository;

    public ShopService(ProductRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Product> getProducts() {
        return this.userRepository.findAll();
    }
}
