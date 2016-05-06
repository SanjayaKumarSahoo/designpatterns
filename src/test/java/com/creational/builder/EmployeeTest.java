package com.creational.builder;



import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class EmployeeTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testEmployee(){
		Employee employee = new Employee.Builder()
				.withEname("Allen")
				.withEmpno(1L).withJob("Manager")
				.withManagerId(2L)
				.withHireDate(new java.util.Date())
				.withSalary(100000)
				.withCommission(10)
				.withDepartmentNo(3).build();
		
		// Assert
		assertEquals(employee.getEname(), "Allen");
		assertEquals(employee.getEmpno(), 1L);
		assertEquals(employee.getJob(), "Manager");
		assertEquals(employee.getManagerId(), 2L);
		assertEquals(employee.getHireDate().getYear(), new Date().getYear());
		assertEquals(employee.getHireDate().getMonth(), new Date().getMonth());
		assertEquals(employee.getHireDate().getDay(), new Date().getDay());		
		assertEquals(employee.getSalary(), 100000d, 0.001);
		assertEquals(employee.getCommission(), 10d, 0.001);
		assertEquals(employee.getDepartno(), 3);
	}
	
}
