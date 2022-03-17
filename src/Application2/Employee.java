package Application2;

import java.util.*;

import Application.Student;

public class Employee implements Comparator{
	private int empId;
	private String empName;
	private int empAge;
	private int empSalary;
	
	
	public Employee() {
		super();
	}




	public Employee(int empId, String empName, int empAge, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
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


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	public int getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}


	@Override
	public int compare(Object o1, Object o2) {
		Employee employee = (Employee) o1;
		Employee 
		if (this.empAge > employee.empAge) {
			return 1;
		} else if (this.empAge < employee.empAge) {
			return -1;
		}
		return 0;
	}
	
	
	
	
	
}
