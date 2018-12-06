package com.spring.test.javBasedConfig.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.test.javBasedConfig.conf.MyAppConfig;
import com.spring.test.javBasedConfig.pojos.Employee;

public class JavaBasedConfigApp {
	public static void main(String s[]){
		ApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
		Employee employee=(Employee)context.getBean("emp");
		System.out.println(employee);
	}
}
