package com.app.service.rating.serviceImpl;

import com.app.service.rating.entites.Rating;
import com.app.service.rating.repository.RatingRepo;
import com.app.service.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    RatingRepo ratingRepo;
    @Override
    public Rating addRating(Rating rate) {
        return ratingRepo.save(rate);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingsByUserId(String userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsByHotelId(String hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
