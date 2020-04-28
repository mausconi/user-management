package com.coelho.api_manager_users.exceptions;

public class CustomException extends Exception {

    private int statusCode;

    public CustomException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    @Override
    public int statusCode() {
        return statusCode;
    }
}
