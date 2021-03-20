package com.michel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
