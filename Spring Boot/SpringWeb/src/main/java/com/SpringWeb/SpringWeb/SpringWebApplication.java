package com.SpringWeb.SpringWeb;

import Q4.MyProjectServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringWebApplication.class, args);

//		MyProjectServiceConfig mpc = applicationContext.getBean(MyProjectServiceConfig.class) ;
//		System.out.println("URL :- " + mpc.getUrl() +  " -> "   +  "PORT :- " + mpc.getPort());

	}

}
