package Q_6.Q.q6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(Main.class, args);

	  All_Impl impl = applicationContext.getBean(All_Impl.class) ;

        impl.printShow();



	}

}
