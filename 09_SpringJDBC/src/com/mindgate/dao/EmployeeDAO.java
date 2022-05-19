package com.mindgate.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mindgate.pojo.Employee;
import com.mindgate.rowmapper.EmployeeRowMapper;

@Repository
@Scope("prototype")
public class EmployeeDAO implements EmployeeDaoInterface {
	private JdbcTemplate jdbcTemplate;
	private int resultcount;
	private static final String INSERT_EMPLOYEE = "INSERT INTO employee_details(name,salary) VALUES(?,?)";
	private static final String SELECT_ALL_EMPLOYEE = "SELECT * FROM employee_details";
	private static final String SELECT_SINGLE_EMPLOYEE = "SELECT * FROM employee_details WHERE employeeId=?";
	private static final String UPDATE_EMPLOYEE = "UPDATE  employee_details SET name=?,salary=? WHERE employeeId=?";
	private static final String DELETE_EMPLOYEE ="DELETE employee_details WHERE employeeId=?";
	public EmployeeDAO() {
	}

	@Autowired
	public EmployeeDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("Inserting new employee into database");
		System.out.println(employee);

		Object[] args = { employee.getName(), employee.getSalary() };
		resultcount = jdbcTemplate.update(INSERT_EMPLOYEE, args);
		if (resultcount > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> allEmployee = jdbcTemplate.query(SELECT_ALL_EMPLOYEE, new EmployeeRowMapper());
		return allEmployee;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {

		System.out.println("get data by employeeid");
		Object[] args = { employeeId };

		Employee employee = jdbcTemplate.queryForObject(SELECT_SINGLE_EMPLOYEE, args, new EmployeeRowMapper());
		return employee;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		Object[] args = { employee.getName(), employee.getSalary() ,employee.getEmployeeId()};
		resultcount = jdbcTemplate.update(UPDATE_EMPLOYEE, args);
		if (resultcount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		Object[] args = { employeeId };
		resultcount = jdbcTemplate.update(DELETE_EMPLOYEE, args);
		if (resultcount > 0)
			return true;
		else
			return false;
	}

}
