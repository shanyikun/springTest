package com.unipay.www;

import java.time.LocalDate;

public class HelloWorld {
	private String message;
	private String x;
	private String y;
	private LocalDate date;
	
	public HelloWorld(String x, String y, LocalDate date) {
		this.x=x;
		this.y=y;
		this.date=date;
	}
	
	public void getX() {
		System.out.println(x);
	}
	public void getY() {
		System.out.println(y);
	}
	public void getDate() {
		System.out.println(date);
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public void getMessage() {
		System.out.println(this.message);
	}
	
	public void initMethod() {
		System.out.println("bean is going through init");
	}
	
	public void destroyMethod() {
		System.out.println("bean is going through destroy");
	}
}
