package Q2;

import Q1.Q1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(Main.class, args);

		IndexFinder1 indexFinder = new IndexFinder1(new Bsearch()) ;
		int[] arr = new int[]{1,2,3,4,5,6,7} ;

		System.out.println("Index Found At " +indexFinder.finder(arr , 3) );




	}

}
