package com.spring.test.annotationConfig.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.annotationConfig.pojos.Employee;

public class AnnotationDemoApp {
	
	public static void main(String s[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("conf/annotation.xml");
		Employee emp1=(Employee)context.getBean("emp1");
		System.out.println(emp1);

	}

}
