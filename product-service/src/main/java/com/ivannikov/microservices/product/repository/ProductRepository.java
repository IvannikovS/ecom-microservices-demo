package com.ivannikov.microservices.product.repository;

import com.ivannikov.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
