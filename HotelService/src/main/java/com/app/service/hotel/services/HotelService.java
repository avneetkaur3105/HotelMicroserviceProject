package com.app.service.hotel.services;

import com.app.service.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel addHotel(Hotel hotel);
    //get all hotels
    List<Hotel> getAllHotel();
    //get hotel by id
    Hotel getHotelById(String id);

}
