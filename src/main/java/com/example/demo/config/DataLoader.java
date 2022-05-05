package com.example.demo.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;//起動時にRunメソッドが走るよ
import org.springframework.stereotype.Component;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.EmployeeRepository;

@Component
public class DataLoader implements ApplicationRunner{

	private final DepartmentRepository repository;
	private final EmployeeRepository repository2;
	
	public DataLoader(DepartmentRepository repository, EmployeeRepository repository2) {
		this.repository = repository;
		this.repository2 = repository2;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		var salse = new Department();
		salse.setName("営業");
		repository.save(salse);
		
		var development = new Department();
		development.setName("開発");
		repository.save(development);
		
		var employee1 = new Employee();
		employee1.setName("hirokore");
		employee1.setDepartment(development);
		repository2.save(employee1);

		var employee2 = new Employee();
		employee2.setName("yamada");
		employee2.setDepartment(development);
		repository2.save(employee2);
	}
	
}
