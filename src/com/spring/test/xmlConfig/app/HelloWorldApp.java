package com.spring.test.xmlConfig.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.test.xmlConfig.pojos.BankAccount;
import com.spring.test.xmlConfig.pojos.Employee;
import com.spring.test.xmlConfig.pojos.HelloWorld;
import com.spring.test.xmlConfig.pojos.StationaryInventory;

public class HelloWorldApp {

	public static void main(String s[]){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("conf/beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
		obj.setMessage("Vijay");
		System.out.println(obj.getMessage());
		HelloWorld obj2 = (HelloWorld)context.getBean("helloWorld");
		System.out.println(obj2.getMessage());
		
		}
}
