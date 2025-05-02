package com.e_commerce.store.repository;

import com.e_commerce.store.model.SKU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SKURepository extends JpaRepository<SKU, Long> {
    // Custom queries can be added here if needed
}