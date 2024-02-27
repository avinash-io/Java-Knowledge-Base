package com.amenon848.firstexample.review;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);

    Review addReview(Long companyid, Review review);

    Review findReviewById(Long companyid, Long reviewid);

    boolean updateReview(Long companyid, Long reviewid, Review review);

    boolean deleteReview(Long companyid, Long reviewid);
}
