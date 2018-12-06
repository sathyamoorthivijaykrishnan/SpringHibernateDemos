package com.spring.test.javBasedConfig.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.test.javBasedConfig.pojos.BankAccount;
import com.spring.test.javBasedConfig.pojos.Employee;

@Configuration

public class MyAppConfig {

	
	@Bean
	public BankAccount loanAccount(){
		BankAccount b=new BankAccount();
		b.setAccountNumber("12345");
		b.setBankName("HDFC");
		b.setBranchName("TBM");		
		return b;
		
	}
	@Bean
	public BankAccount salAccount(){
		BankAccount b=new BankAccount();
		b.setAccountNumber("54321");
		b.setBankName("SBI");
		b.setBranchName("PKN");		
		return b;
		
	}
	
	@Bean
	public Employee emp(){
		Employee e=new Employee();
		e.setEmpId(570670);
		e.setName("Vijay");
		e.setSal(15000);
		e.setLoanAcc(loanAccount());
		e.setSalAcc(salAccount());
		return e;
		
	}
	
}
