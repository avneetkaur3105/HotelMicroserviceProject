package com.app.service.hotel.serviceImpl;

import com.app.service.hotel.entities.Hotel;
import com.app.service.hotel.repository.HotelRepo;
import com.app.service.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.service.hotel.exceptions.*;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelRepo hotelRepo;
    @Override
    public Hotel addHotel(Hotel hotel) {
        String id=UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getHotelById(String id) {
        return hotelRepo.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
