package com.example.product_api.repository;

import com.example.product_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    public List<Product> findByName(String name);

}
