package com.spring.test.xmlConfig.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.xmlConfig.pojos.Employee;

public class EmployeeApp {
	
	public static void main(String s[]){
			
			ApplicationContext context=new ClassPathXmlApplicationContext("conf/beans.xml");
			Employee employee1=(Employee)context.getBean("employee1");
			Employee employee2=(Employee)context.getBean("employee2");
			Employee employee3=(Employee)context.getBean("employee3");
			Employee employee4=(Employee)context.getBean("employee4");
		 	Employee employee5=(Employee)context.getBean("employee5");

			System.out.println("Employe 1..."+employee1);
			System.out.println("Employe 2..."+employee2);
			System.out.println("Employe 3..."+employee3);
			System.out.println("Employe 4..."+employee4);	
			System.out.println("Employe 5..."+employee5);	
	}

}
