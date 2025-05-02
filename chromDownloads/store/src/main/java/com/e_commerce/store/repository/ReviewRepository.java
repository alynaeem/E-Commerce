package com.e_commerce.store.repository;

import com.e_commerce.store.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Custom queries can be added here if needed
}