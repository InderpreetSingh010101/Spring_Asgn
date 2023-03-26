package com.Q1.q1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Q1Application {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(Q1Application.class, args);

	  All_Impl impl = applicationContext.getBean(All_Impl.class) ;

        impl.printShow();



	}

}
