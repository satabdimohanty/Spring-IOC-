package com.example.spring__IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
//@Service
public class SpringIocApplication implements CommandLineRunner {
@Autowired
private Student student;
	public static void main(String[] args) {
		SpringApplication.run(SpringIocApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		student.run();
		System.out.println("-------------");
		student.hell();

		System.out.println("-------------");
		student.show();


		System.out.println("-------------");
		student.arr();


		System.out.println("-------------");
		student.star();
		System.out.println("-------------");
		student.doo();
		student.hello();

	}

}
