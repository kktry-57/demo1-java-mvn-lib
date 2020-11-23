package tw.com.carrefour.utilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtilitiesApplication {

	public static void main(String[] args) {
		System.out.println("12345".sub(0, 2));
		System.out.println(MyClass.hello());

		
	}

}
