package com.example.GlobalJava.repository;

import com.example.GlobalJava.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface UserRepository extends JpaRepository<User, Long> {
}