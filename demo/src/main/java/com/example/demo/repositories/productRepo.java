package com.example.demo.repositories;

import com.example.demo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface productRepo extends JpaRepository<Product,Long> {

}
