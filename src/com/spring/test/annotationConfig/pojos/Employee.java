package com.spring.test.annotationConfig.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp1")
public class Employee {

	@Value("570670")
	private int empId;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public BankAccount getSalAccount() {
		return salAccount;
	}
	public void setSalAccount(BankAccount salAccount) {
		this.salAccount = salAccount;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", sal=" + sal
				+ ", salAccount=" + salAccount + "]";
	}
	@Value("Vijay")
	private String name;
	@Value("25000")
	private double sal;
	@Autowired
	@Qualifier("bankAccount")
	private BankAccount salAccount;
	
}
