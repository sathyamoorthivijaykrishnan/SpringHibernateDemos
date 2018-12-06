package com.spring.test.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.test.orm.pojos.Item;

@Repository("itemDAO")
public class ItemDAO extends HibernateDaoSupport{

	public ItemDAO() {
		super();
	}
	
	@Autowired
	@Qualifier("sessionFactory")
	@Required
	public void setMySessionFactory(SessionFactory sessionFactory)
	{
		this.setSessionFactory(sessionFactory);
	}

	@Transactional
	public void addItem(Item item){
		this.getHibernateTemplate().save(item);
	}
	
	@Transactional
	public void removeItem(Item item){
		this.getHibernateTemplate().delete(item);
	}
	@Transactional
	public void updateItem(Item item){
		this.getHibernateTemplate().update(item);
	}
	public Item getItem(int itemCode){
		return this.getHibernateTemplate().get(Item.class,itemCode);
	}
	public List<Item> getItem(){
		return this.getHibernateTemplate().loadAll(Item.class);
	}
	
}
