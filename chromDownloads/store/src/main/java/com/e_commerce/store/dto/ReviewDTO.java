package com.e_commerce.store.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewDTO {

    private Long id;
    private Long userId;
    private Long productId;
    private int rating;
    private String comment;
    private String date;
}