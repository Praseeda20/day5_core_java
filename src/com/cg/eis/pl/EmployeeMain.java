package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
	Employee emp= new Employee();
	Scanner sc=new Scanner(System.in);
	EmpServiceImp emps=new EmpServiceImp();
		System.out.println("Enter the employee ID: ");
		int empId=sc.nextInt();
		
		System.out.println("Enter the employee name: ");
		String empName=sc.next();
		
		System.out.println("Enter the employee Salary: ");
		float empSal=sc.nextFloat();
		
		System.out.println("Enter the employee Designation: ");
		String empDesgn=sc.nextLine();
	    empDesgn+=sc.nextLine();
		
		emp=new Employee(empId,empName,empSal,empDesgn);
		System.out.println(emps.getInsuranceScheme(emp));
		System.out.println(emps.displayEmpInfo(emp,emps.getInsScheme()));
			
	sc.close();
}
}
