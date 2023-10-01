package com.cdac.domain;

public class Employee {

	public int EmpId;
	public String Name;
	public float Salary;
	
	public Employee() {
		
	}
	public Employee(int empId, String name, float salary) {
		EmpId = empId;
		Name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
}
