package com.example.demo.Exception;

import java.util.Date;

public class ErrorDetails {
	
	public Date time;
	public String message;
	public String url;
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ErrorDetails(Date time, String message, String url) {
		super();
		this.time = time;
		this.message = message;
		this.url = url;
	}
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ErrorDetails [time=" + time + ", message=" + message + ", url=" + url + "]";
	}
	
	

}
