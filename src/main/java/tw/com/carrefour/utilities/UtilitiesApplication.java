package tw.com.carrefour.utilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tw.com.carrefour.utilities.Bean.HelloBean;

@SpringBootApplication
public class UtilitiesApplication {

	public static void main(String[] args) {		
		HelloBean h = new HelloBean();
		System.out.println(h.hello());
		System.out.println(MyClass.hello());

		
	}

}
