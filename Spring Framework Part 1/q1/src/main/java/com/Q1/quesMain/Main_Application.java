package com.Q1.quesMain;


import Q2.Q2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main_Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Main_Application.class, args);
//		Q1 instance = new Q1() ;

		// Q2


		Q2 instance = new Q2() ;
//		IndexFinder1 indexFinder1 = applicationContext.getBean(IndexFinder1.class);
		
		

	}

}
