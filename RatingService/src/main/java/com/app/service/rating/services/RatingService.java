package com.app.service.rating.services;

import com.app.service.rating.entites.Rating;

import java.util.List;

public interface RatingService {

    //create Rating
    Rating addRating(Rating rate);
    // getallrating

    List<Rating> getAllRatings();
    // get ratings by userid

    List<Rating> getRatingsByUserId(String userId);
    // get rating by hotelid

    List<Rating> getRatingsByHotelId(String hotelId);
}
