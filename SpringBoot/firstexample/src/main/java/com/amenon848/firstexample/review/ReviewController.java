package com.amenon848.firstexample.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company/{companyid}/review")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyid) {
        return new ResponseEntity<List<Review>>(reviewService.getAllReviews(companyid), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Review> addReview(@PathVariable Long companyid, @RequestBody Review review) {
        Review result = reviewService.addReview(companyid, review);
        return result != null ? new ResponseEntity<Review>(result,HttpStatus.CREATED) :
                new ResponseEntity<Review>(result,HttpStatus.NOT_FOUND);
        //return new ResponseEntity<Review>(reviewService.addReview(companyid, review),HttpStatus.CREATED);
    }

    @GetMapping("/{reviewid}")
    public ResponseEntity<Review> findReviewById(@PathVariable Long companyid, @PathVariable Long reviewid) {
        Review result = reviewService.findReviewById(companyid, reviewid);
        return result != null ? new ResponseEntity<Review>(result,HttpStatus.OK) :
                new ResponseEntity<Review>(result, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{reviewid}")
    public ResponseEntity<String> updateReviewByd(@PathVariable Long companyid, @PathVariable Long reviewid,@RequestBody Review review) {
        return reviewService.updateReview(companyid, reviewid, review) ? new ResponseEntity<String>("Updated Review",HttpStatus.OK) :
                new ResponseEntity<String>("ReviewId or CompanyId is incorret/Invalid and Updation failed", HttpStatus.NOT_FOUND);

    }

    @DeleteMapping("/{reviewid}")
    public ResponseEntity<String> updateReviewByd(@PathVariable Long companyid, @PathVariable Long reviewid) {
            return reviewService.deleteReview(companyid, reviewid) ? new ResponseEntity<String>("Deleted Review",HttpStatus.OK) :
                    new ResponseEntity<String>("ReviewId or CompanyId is incorret/Invalid and Deletion failed", HttpStatus.NOT_FOUND);


    }
}
