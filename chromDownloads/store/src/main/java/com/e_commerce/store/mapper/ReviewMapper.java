package com.e_commerce.store.mapper;

import com.e_commerce.store.model.Review;
import com.e_commerce.store.dto.ReviewDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ReviewMapper {

    ReviewDTO reviewToReviewDTO(Review review);

    Review reviewDTOToReview(ReviewDTO reviewDTO);
}