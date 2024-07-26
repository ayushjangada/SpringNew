package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Result {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
		
	}
}
