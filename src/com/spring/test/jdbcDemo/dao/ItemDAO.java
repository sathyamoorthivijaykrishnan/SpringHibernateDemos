package com.spring.test.jdbcDemo.dao;

import java.util.List;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.test.jdbcDemo.exceptions.CustomExceptionTranslator;
import com.spring.test.jdbcDemo.pojos.Item;
import com.spring.test.jdbcDemo.rowMappers.ItemRowMapper;


@Repository("itemDAO")
public class ItemDAO {
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("itemRowMapper")
	private ItemRowMapper rowMapper;
	
	
	public ItemDAO() {
		super();
		this.jdbcTemplate=new JdbcTemplate();
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Autowired
	@Qualifier("dataSource")
	@Required
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate.setDataSource(dataSource);
	}
	
	@Autowired
	@Qualifier("customExceptionTranslator")
	@Required
	public void setExceptionTranslator(CustomExceptionTranslator exceptionTranslator) {
		this.jdbcTemplate.setExceptionTranslator(exceptionTranslator);
	}

	public ItemRowMapper getRowMapper() {
		return rowMapper;
	}

	public void setRowMapper(ItemRowMapper rowMapper) {
		this.rowMapper = rowMapper;
	}
	
	
	public void addItem(Item item){
		String sql ="insert into Item value(?,?,?)";
		jdbcTemplate.update(sql, item.getIcode(),item.getiName(),item.getIprice());
	}
	public void removeItem(Item item){
		String sql ="delete from Item where icode=?";
		jdbcTemplate.update(sql, item.getIcode());
	}
	public void updateItem(Item item){
		String sql ="update Item set iname=?,iprice=? where icode=?";
		jdbcTemplate.update(sql, item.getiName(),item.getIprice(),item.getIcode());
	}
	public Item getItem(int icode){
		String sql ="select * from Item where icode=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{icode}, rowMapper);
	}
	public List<Item> getItems(){
		String sql= "select * from Item";
		return jdbcTemplate.query(sql, rowMapper);
	}

}
