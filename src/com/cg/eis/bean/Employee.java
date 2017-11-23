package com.cg.eis.bean;

public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	private String empDesign;
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDesign() {
		return empDesign;
	}

	public void setEmpDesign(String empDesign) {
		this.empDesign = empDesign;
	}



	public Employee() {
	}
	
	public Employee(int empId, String empName, float empSalary,
			String empDesign) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesign = empDesign;
	
	}

	
	
	
	
	
}
