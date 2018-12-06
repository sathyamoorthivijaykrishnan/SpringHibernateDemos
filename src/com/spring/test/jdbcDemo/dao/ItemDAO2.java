package com.spring.test.jdbcDemo.dao;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.test.jdbcDemo.exceptions.CustomExceptionTranslator;
import com.spring.test.jdbcDemo.pojos.Item;
import com.spring.test.jdbcDemo.rowMappers.ItemRowMapper;


@Repository
public class ItemDAO2 {

	private DataSource dataSource;
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("itemRowMapper")
	private ItemRowMapper rowMapper;
	
	
	public ItemDAO2() {
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Autowired
	@Qualifier("dataSource")
	@Required
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate= new NamedParameterJdbcTemplate(dataSource);
	}
	
	/*@Autowired
	@Qualifier("customExceptionTranslator")
	@Required
	public void setExceptionTranslator(CustomExceptionTranslator exceptionTranslator) {
		this.jdbcTemplate.
	}
*/
	public ItemRowMapper getRowMapper() {
		return rowMapper;
	}

	public void setRowMapper(ItemRowMapper rowMapper) {
		this.rowMapper = rowMapper;
	}
	
	
	public void addItem(Item item){
		String sql ="insert into Item value(:iCode,:iName,:iPrice)";
		BeanPropertySqlParameterSource parameters=new BeanPropertySqlParameterSource(item);
		jdbcTemplate.update(sql, parameters);
	}
	public void removeItem(Item item){
		String sql ="delete from Item where icode=:iCode";
		BeanPropertySqlParameterSource parameters=new BeanPropertySqlParameterSource(item);
		jdbcTemplate.update(sql, parameters);
	}
	public void updateItem(Item item){
		String sql ="update Item set iname=:iName,iprice=:iPrice where icode=:iCode";
		BeanPropertySqlParameterSource parameters=new BeanPropertySqlParameterSource(item);
		jdbcTemplate.update(sql, parameters);
	}
	public Item getItem(int icode){
		String sql ="select * from Item where icode=:iCode";
  Map<String,Integer> param = Collections.singletonMap("iCode", icode);
		return jdbcTemplate.queryForObject(sql, param, rowMapper);
	}
	public List<Item> getItems(){
		String sql= "select * from Item";
		return jdbcTemplate.query(sql, rowMapper);
	}

}