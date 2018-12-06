package com.spring.test.externalizedConfig.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.spring.test.externalizedConfig.pojos.BankAccount;
import com.spring.test.externalizedConfig.pojos.Employee;

@Configuration
@PropertySource("classpath:conf/externalConfiguration.properties")
public class MyAppConfig {
    @Autowired
	private Environment env; 
	@Bean
	public BankAccount loanAccount(){
		BankAccount b=new BankAccount();
		b.setAccountNumber(env.getProperty("bankacc.loan.accno"));
		b.setBankName(env.getProperty("bankacc.loan.bank"));
		b.setBranchName(env.getProperty("bankacc.loan.branch"));		
		return b;
		
	}
	@Bean
	public BankAccount SalAccount(){
		BankAccount b=new BankAccount();
		b.setAccountNumber(env.getProperty("bankacc.sal.accno",String.class));
		b.setBankName(env.getProperty("bankacc.sal.bank",String.class));
		b.setBranchName(env.getProperty("bankacc.sal.branch",String.class));		
		return b;
		
	}
	
	@Bean
	public Employee emp(){
		Employee e=new Employee();
		e.setEmpId(env.getProperty("emp.id",Integer.class));
		e.setName(env.getProperty("emp.name"));
		e.setSal(env.getProperty("emp.sal",Double.class));
		e.setLoanAcc(loanAccount());
		e.setSalAcc(SalAccount());
		return e;
		
	}
	
}
