package com.spring.test.xmlConfig.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.xmlConfig.pojos.Employee;

public class AutoWireByNameApp {

	public static void main(String s[]){

	ApplicationContext context=new ClassPathXmlApplicationContext("conf/autoWireByName.xml");
	Employee employee=(Employee)context.getBean("employee2");
	System.out.println("Autowire by Name 1...."+employee);
	}

}
