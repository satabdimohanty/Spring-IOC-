package com.example.SpringCore;

import ANOTHERPACKAGE.Apple;
import MYPACKAGE.Demo;
import com.example.SpringCore.Controller.MyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication implements CommandLineRunner {
	@Autowired

private  Student student;
	@Autowired
	private Principal principal;
	@Autowired
	private Employee employee;
	@Autowired
	private Demo demo;
	@Autowired
	private Apple apple;
	@Autowired
	private MyController myController;
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//implementation of student class
		student.string();
		student.run();
		student.setName("ABCD");
		student.setState("EFGH");
		System.out.println(student);
		//implementation of principal class
		principal.setName("ABCDEFGH");
		System.out.println(principal);
		principal.show();
		//implementation of employee class
		employee.emp();
		//demo og here by the help of component scan
		demo.run();
		//implementation of controller class
		myController.run();
		//implementation of Another Package
		apple.setId(111);
		apple.setName("HELLO PACKAGE");
		System.out.println(apple);



	}
}
