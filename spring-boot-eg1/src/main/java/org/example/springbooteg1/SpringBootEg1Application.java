package org.example.springbooteg1;

import org.example.springbooteg1.service.EmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootEg1Application {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(SpringBootEg1Application.class, args);

		EmpService empService = context.getBean(EmpService.class);
		System.out.println(empService.getDummyEmp());
	}

}
