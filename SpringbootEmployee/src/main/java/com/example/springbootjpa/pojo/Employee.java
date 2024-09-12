package com.example.springbootjpa.pojo;

public class Employee {

	private int eid;
	
	private String ename;
	
	private double salary;
	
	private String role;

    
	
	public Employee(int eid, String ename, double salary, String role) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.role = role;
	}

	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salayry=" + salary + ", role=" + role + "]";
	}
	
	
}
