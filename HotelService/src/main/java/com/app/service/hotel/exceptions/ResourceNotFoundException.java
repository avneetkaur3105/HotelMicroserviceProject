package com.app.service.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("The given resource not found on server !!");
    }
}
