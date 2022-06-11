package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repositories.EmployeeRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;

	@Autowired
	public DemoApplication(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(employeeRepository.findAll().isEmpty()) {
			employeeRepository.save(new Employee("Axel", "1005234865", "amorales264", "1234"));
			employeeRepository.save(new Employee("Jhon", "1234567890", "montecristo", "1234"));
		}

		for(Employee employee : employeeRepository.findAll()) {
			System.out.println(employee);
		}
	}
}
