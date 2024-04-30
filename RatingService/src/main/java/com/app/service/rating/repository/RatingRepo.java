package com.app.service.rating.repository;

import com.app.service.rating.entites.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends MongoRepository<Rating,String> {

    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);

}
