package com.example.springbootjpa.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;

import com.example.springbootjpa.pojo.Employee;

@Component
public class EmployeeDao {
	
  
	@Autowired
	private DataSource ds;

    
     public void save(Employee e) {
		System.out.println("you are in employee dao");
		try {
		Connection c =	ds.getConnection();
		PreparedStatement ps = c.prepareStatement("insert into testdb.employee values(?,?,?,?)");
		ps.setInt(1, e.getEid());
		ps.setString(2, e.getEname());
		ps.setDouble(3, e.getSalary() );
		ps.setString(4, e.getRole());
		
		ps.executeUpdate();
		
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
		   
		}
	  }
}
