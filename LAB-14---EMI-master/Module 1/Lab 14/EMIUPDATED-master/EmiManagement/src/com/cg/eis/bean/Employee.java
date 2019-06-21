package com.cg.eis.bean;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String empDesg;
	private String empScheme;
	
	//construtor using Fields
//	public Employee(int empId, String empName, double empSalary, String empDesg) {
//		this.empId = empId;
//		this.empName = empName;
//		this.empSalary = empSalary;
//		this.empDesg = empDesg;
//		
//		// generate scheme
//		this.empScheme = "Scheme " + generateScheme(empSalary);
//		System.out.println();
//		
//	}
//	
//	private static String generateScheme(double sal) {
//		if(sal >= 40000.00) return "A";
//		else if(sal >= 20000.00 && sal <40000.00)return "B";
//		else if(sal >=5000.00 && sal < 20000.00) return "C";
//		else return "No";
//	}
//	
	public Employee() { // default constructor
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(int empId, String empName, double empSalary, String empDesg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesg = empDesg;
		//this.empScheme = empScheme;
	}



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
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public String getEmpScheme() {
		return empScheme;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesg=" + empDesg
				+ ", empScheme=" + empScheme + "]";
	}

	public void setEmpScheme(String empScheme) {
		this.empScheme = empScheme;
	}

	
	
	
}	
