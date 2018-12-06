package com.spring.test.jdbcDemo.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.jdbcDemo.dao.ItemDAO;
import com.spring.test.jdbcDemo.dao.ItemDAO2;
import com.spring.test.jdbcDemo.dao.ItemDAO3;
import com.spring.test.jdbcDemo.pojos.Item;

public class SpringJdbcDemoApp {
	
	public static void main(String s[])
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("conf/datasource.xml");
	
	Item item1= (Item)context.getBean("item");
	Item item2= (Item)context.getBean("item");
	Item item3= (Item)context.getBean("item");
	
	/*item1.setIcode(1);
	item1.setiName("Rice");
	item1.setIprice(100);*/
	item2.setIcode(5);
	item2.setiName("nuts");
	item2.setIprice(500);
	/*item3.setIcode(3);
	item3.setiName("Ragi");
	item3.setIprice(100);*/
	
	
	ItemDAO3 itemDAO = (ItemDAO3)context.getBean("itemDAO3");
	//itemDAO.addItem(item2);
	/*itemDAO.addItem(item2);
	itemDAO.addItem(item3);*/
	
	//itemDAO.removeItem(item1);
	/*itemDAO.updateItem(item2);*/
	List<Item> items =itemDAO.getItems();
	
	for(Item item: items){
		System.out.println(item);
	}
	
	Item i = itemDAO.getItem(item2.getIcode());
	System.out.println(i);

  }
}
