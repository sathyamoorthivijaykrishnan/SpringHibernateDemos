package com.spring.test.externalizedConfig.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.test.externalizedConfig.conf.MyAppConfig;
import com.spring.test.externalizedConfig.pojos.Employee;

public class ExternalizedConfigApp {
	public static void main(String s[]){
		ApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
		Employee employee=(Employee)context.getBean("emp");
		System.out.println(employee);
	}
}
