package com.spring.test.externalizedConfig.pojos;

public class Employee {

	private String name;
	private int empId;
	private double sal;
	private BankAccount salAcc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSal() {
		return sal;
	}
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", sal=" + sal
				+ ", salAcc=" + salAcc + ", loanAcc=" + loanAcc + "]";
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public BankAccount getSalAcc() {
		return salAcc;
	}
	public void setSalAcc(BankAccount salAcc) {
		this.salAcc = salAcc;
	}
	public BankAccount getLoanAcc() {
		return loanAcc;
	}
	public void setLoanAcc(BankAccount loanAcc) {
		this.loanAcc = loanAcc;
	}
	private BankAccount loanAcc;
	public Employee(String name, int empId, double sal, BankAccount salAcc) {
		super();
		this.name = name;
		this.empId = empId;
		this.sal = sal;
		this.salAcc = salAcc;
	}
	public Employee() {
		super();
	}
	
	
}
