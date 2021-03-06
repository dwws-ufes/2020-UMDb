package com.ufes.inf.dwws.umdb.service;

import com.ufes.inf.dwws.umdb.domain.Review;
import com.ufes.inf.dwws.umdb.persistence.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ufes.inf.dwws.umdb.domain.User;
import com.ufes.inf.dwws.umdb.domain.Movie;

import com.ufes.inf.dwws.umdb.persistence.UserRepository;
import com.ufes.inf.dwws.umdb.persistence.MovieRepository;

import java.util.Optional;
import java.util.List;

@Component
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    UserRepository userRepository;

    public ReviewService (ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    public Review findReviewById (Long id) {
        Optional<Review> d = this.reviewRepository.findById(id);

        if (d.isPresent()) {
            return d.get();
        } else {
            return null;
        }
    }

    public Boolean deleteReviewById(Long id) {
        Optional<Review> d = this.reviewRepository.findById(id);

        if (d.isPresent()) {
            this.reviewRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}
