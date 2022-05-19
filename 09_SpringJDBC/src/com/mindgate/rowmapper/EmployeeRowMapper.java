package com.mindgate.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.pojo.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
		int employeeId=resultSet.getInt("employeeId");
		String name=resultSet.getString("name");
		double salary=resultSet.getDouble("salary");
	
		
		Employee employee=new Employee(employeeId, name, salary);
		return employee;
	}
	

}
