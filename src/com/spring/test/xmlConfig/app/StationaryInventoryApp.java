package com.spring.test.xmlConfig.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.xmlConfig.pojos.StationaryInventory;

public class StationaryInventoryApp {
  public static void main(String s[]){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("conf/beans.xml");
		StationaryInventory sI1= (StationaryInventory)context.getBean("inv1");
		System.out.println("StationaryInventory 1...."+sI1);
  }
	
}
