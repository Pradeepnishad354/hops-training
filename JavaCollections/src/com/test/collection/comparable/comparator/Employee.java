package com.test.collection.comparable.comparator;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private String empCity;

	public Employee(int empId, String empName, String empCity) {

		this.empId = empId;
		this.empName = empName;

		this.empCity = empCity;

	}
	@Override
	public int compareTo(Employee o) {
		
		return empId-o.empId;
	}
	
	
	
	
	public void setEmpId(int empId) {

		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpName(String empName) {

		this.empName = empName;
	}

	public String getEmpName() {

		return empName;
	}

	public void setEmpCity(String empCity) {

		this.empCity = empCity;
	}

	public String getEmpCity() {
		return empCity;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + "]";
	}





	
	
	
}
