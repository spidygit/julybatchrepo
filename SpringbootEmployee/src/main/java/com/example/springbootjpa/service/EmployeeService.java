package com.example.springbootjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.springbootjpa.Dao.EmployeeDao;
import com.example.springbootjpa.pojo.Employee;

@Service
@Component
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public void save(Employee e) {
		System.out.println("you are in empployee service class");
		dao.save(e);
	}
}
