package com.example.demo.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	//handling specific exception
	@ExceptionHandler(APIException.class)
	public ResponseEntity<?> APIException(APIException apiException,WebRequest webRequest)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), apiException.getMessage(),webRequest.getDescription(false));
		return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> ResourceNotFoundException(ResourceNotFoundException foundException,WebRequest webRequest)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), foundException.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	//handling global exception
	public ResponseEntity<?> Exception(Exception exception,WebRequest webRequest)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), exception.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
