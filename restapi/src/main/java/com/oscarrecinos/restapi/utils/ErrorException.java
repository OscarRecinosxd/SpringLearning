package com.oscarrecinos.restapi.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ErrorException extends RuntimeException{
	public ErrorException(String message){
        super(message);
    }
}
