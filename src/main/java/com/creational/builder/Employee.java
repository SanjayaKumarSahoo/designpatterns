package com.creational.builder;

import java.util.Date;

public final class Employee {

	private final String ename;
	private final long empno;
	private final String job;
	private final long managerId;
	private final Date hireDate;
	private final double salary;
	private final double commission;
	private final int departno;

	private Employee(Builder builder) {
		this.ename = builder.ename;
		this.empno = builder.empno;
		this.job = builder.job;
		this.managerId = builder.managerId;
		this.hireDate = builder.hireDate;
		this.salary = builder.salary;
		this.commission = builder.commission;
		this.departno = builder.departno;
	}

	public String getEname() {
		return ename;
	}

	public long getEmpno() {
		return empno;
	}

	public String getJob() {
		return job;
	}

	public long getManagerId() {
		return managerId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public double getCommission() {
		return commission;
	}

	public int getDepartno() {
		return departno;
	}

	public static class Builder {

		private String ename;
		private long empno;
		private String job;
		private long managerId;
		private Date hireDate;
		private double salary;
		private double commission;
		private int departno;

		public Builder withEname(String ename) {
			this.ename = ename;
			return this;
		}

		public Builder withEmpno(long empno) {
			this.empno = empno;
			return this;
		}

		public Builder withJob(String job) {
			this.job = job;
			return this;
		}

		public Builder withManagerId(long managerId) {
			this.managerId = managerId;
			return this;
		}

		public Builder withHireDate(Date hireDate) {
			this.hireDate = hireDate;
			return this;
		}

		public Builder withSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public Builder withCommission(double commission) {
			this.commission = commission;
			return this;
		}

		public Builder withDepartmentNo(int departno) {
			this.departno = departno;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

}
