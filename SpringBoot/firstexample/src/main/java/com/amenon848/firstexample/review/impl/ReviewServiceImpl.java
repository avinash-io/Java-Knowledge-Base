package com.amenon848.firstexample.review.impl;

import com.amenon848.firstexample.company.Company;
import com.amenon848.firstexample.company.CompanyService;
import com.amenon848.firstexample.review.Review;
import com.amenon848.firstexample.review.ReviewRepository;
import com.amenon848.firstexample.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final CompanyService companyService;

    public ReviewServiceImpl(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }

    @Override
    public Review addReview(Long companyid, Review review) {
        Company company = companyService.getCompanyById(companyid);
        if(company != null) {
            review.setCompany(company);
            return reviewRepository.save(review);
        }
        return null;
    }

    @Override
    public Review findReviewById(Long companyid, Long reviewid) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyid);

        for(Review review:reviews) {
            if(review.getId().equals(reviewid)) {
                return review;
            }
        }
        return null;
    }

    public boolean updateReview(Long companyid, Long reviewid, Review updateReview) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyid);

        try {

            Optional<Review> optional = reviews.stream().filter(review -> review.getId().equals(reviewid)).findFirst();

            if (optional.isPresent()) {
                Review review = optional.get();

                if (updateReview.getDescription() != null) review.setDescription(updateReview.getDescription());
                if (updateReview.getRating() != null) review.setRating(updateReview.getRating());
                if (updateReview.getTitle() != null) review.setTitle(updateReview.getTitle());

                reviewRepository.save(review);
                return true;
            }

            return false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteReview(Long companyid, Long reviewid) {

        List<Review> reviews = reviewRepository.findByCompanyId(companyid);

        try {

            Optional<Review> optional = reviews.stream().filter(review -> review.getId().equals(reviewid)).findFirst();

            if (optional.isPresent()) {
                Review review = optional.get();

                Company company = review.getCompany();
                company.getReviews().remove(review);
                companyService.updateCompanyById(company, companyid);

                reviewRepository.deleteById(reviewid);
                return true;
            }

            return false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
