package com.example.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootjpa.pojo.Employee;
import com.example.springbootjpa.service.EmployeeService;

@RestController
@RequestMapping("emp")
public class EmployeeController {

	@Autowired
	private EmployeeService eservice;

@RequestMapping("get")
public void getdata(@RequestParam int id)	{
	System.out.println("in get data");
}
	
@PutMapping("get/{eid}/{ename}")
public void get(@PathVariable int eid, @PathVariable String ename) {
	System.out.println("in put mapping method");
}

 @PostMapping("save")	
 public void save( @RequestBody Employee e) {
		System.out.println("you are in employee save class");
		eservice.save(e);
	}
	
}




