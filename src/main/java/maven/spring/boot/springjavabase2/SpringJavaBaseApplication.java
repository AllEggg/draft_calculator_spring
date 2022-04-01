package maven.spring.boot.springjavabase2;

import maven.spring.boot.springjavabase2.service.Calculator;
import maven.spring.boot.springjavabase2.service.Operation;
import maven.spring.boot.springjavabase2.service.ValueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJavaBaseApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringJavaBaseApplication.class, args);

		Calculator calculator = context.getBean(Calculator.class);
		log.info("{} - {} = {}", 25, 5, calculator.calculate(25, 5, Operation.MINUS));

		context.getBean(ValueService.class).print();
	}

}
