package com.example.demo.repositories;

import com.example.demo.Entity.Cart;
import com.example.demo.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Long> {
    List<Comment> findByProductId(Long productId);
}
