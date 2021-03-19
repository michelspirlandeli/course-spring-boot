package com.michel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

