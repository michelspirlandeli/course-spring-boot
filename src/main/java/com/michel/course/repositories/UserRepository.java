package com.michel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
