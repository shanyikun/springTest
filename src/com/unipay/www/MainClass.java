package com.unipay.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		 System.out.println("test");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      obj.getX();
	      obj.getY();
	      obj.getDate();
	}
}
