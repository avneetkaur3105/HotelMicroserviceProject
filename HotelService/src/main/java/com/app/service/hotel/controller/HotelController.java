package com.app.service.hotel.controller;

import com.app.service.hotel.entities.Hotel;
import com.app.service.hotel.serviceImpl.HotelServiceImpl;
import com.app.service.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    HotelService hotelService;
    @PostMapping
    public ResponseEntity<Hotel> saveHotelDetails(@RequestBody Hotel hotel){
        Hotel hot=hotelService.addHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hot);
    }
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> hotelList=hotelService.getAllHotel();
        return ResponseEntity.ok(hotelList);

    }
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String id){
        Hotel hot2=hotelService.getHotelById(id);
        return ResponseEntity.ok(hot2);
    }
}
