package com.Q1.q1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Q1Application {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(Q1Application.class, args);

	IndexFinder1 idf = applicationContext.getBean(IndexFinder1.class) ;

	int res = idf.finder(new int[]{1,2,3,4} , 3) ;
		System.out.println( "Element Index is "+ res);




	}

}
