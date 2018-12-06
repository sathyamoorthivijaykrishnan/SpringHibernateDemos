package com.spring.test.orm.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.orm.dao.ItemDAO;
import com.spring.test.orm.pojos.Item;

public class SpringOrmDemoApp {

	/**
	 * @param args
	 */
	
		public static void main(String s[])
		{
		ApplicationContext context=new ClassPathXmlApplicationContext("conf/orm.xml");
		
		Item item1= (Item)context.getBean("item");
		Item item2= (Item)context.getBean("item");
		Item item3= (Item)context.getBean("item");
		
		item1.setItemCode(501);
		item1.setItemName("Rice");
		item1.setItemPrice(100.00);
		
		item2.setItemCode(502);
		item2.setItemName("Wheat");
		item2.setItemPrice(200.00);
		
		item3.setItemCode(503);
		item3.setItemName("Ragi");
		item3.setItemPrice(300.00);
		
		ItemDAO itemDAO = (ItemDAO)context.getBean("itemDAO");
		itemDAO.addItem(item1);
		itemDAO.addItem(item2);
		itemDAO.addItem(item3);
		
		List<Item> list=itemDAO.getItem();
		
		for(Item i : list){
			System.out.println(i);
		}
		}
}
