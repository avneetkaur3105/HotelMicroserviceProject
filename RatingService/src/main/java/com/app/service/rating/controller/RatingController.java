package com.app.service.rating.controller;

import com.app.service.rating.entites.Rating;
import com.app.service.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.addRating(rating));
    }
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        return ResponseEntity.ok(ratingService.getAllRatings());
    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingsByUserId(userId));
    }
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingsByHotelId(hotelId));
    }

}
