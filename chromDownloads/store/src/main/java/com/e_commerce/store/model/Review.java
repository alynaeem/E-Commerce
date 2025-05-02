package com.e_commerce.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;             // The user who wrote the review

    @ManyToOne
    private Product product;       // The product being reviewed

    private int rating;            // Rating (e.g., 1 to 5 stars)

    private String comment;        // Review comment (optional)

    private String date;           // Date when the review was submitted
}