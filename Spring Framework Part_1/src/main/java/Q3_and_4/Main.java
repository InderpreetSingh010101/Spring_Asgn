package Q3_and_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(Main.class, args);

	IndexFinder1 idf = applicationContext.getBean(IndexFinder1.class) ;

	int res = idf.finder(new int[]{1,2,3,4} , 3) ;
		System.out.println(res);


		// Q4  VV
		System.out.println(idf);

	}

}
