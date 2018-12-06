package com.spring.test.xmlConfig.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.xmlConfig.pojos.BankAccount;

public class BankAccountApp {

public static void main(String s[]){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("conf/beans.xml");
		BankAccount bankAcc1= (BankAccount)context.getBean("account1");
		BankAccount bankAcc2= (BankAccount)context.getBean("account2");
		BankAccount bankAcc3= (BankAccount)context.getBean("account3");
		System.out.println("Account 1..."+bankAcc1);
		System.out.println("Account 2..."+bankAcc2);
		System.out.println("Account 3..."+bankAcc3);



		
	}
}
