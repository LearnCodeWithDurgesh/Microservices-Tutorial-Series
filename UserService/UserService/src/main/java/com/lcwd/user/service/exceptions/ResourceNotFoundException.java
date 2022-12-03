package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    //extra properties that you want to mange
    public ResourceNotFoundException() {
        super("Resource not found on server !!");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
