package com.michel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
