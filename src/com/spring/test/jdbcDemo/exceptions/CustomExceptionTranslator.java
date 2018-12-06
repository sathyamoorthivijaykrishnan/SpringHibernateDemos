package com.spring.test.jdbcDemo.exceptions;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.SQLExceptionTranslator;
import org.springframework.stereotype.Repository;

@Repository("customExceptionTranslator")
public class CustomExceptionTranslator implements SQLExceptionTranslator{

	@SuppressWarnings("serial")
	public DataAccessException translate(String task,String sql,SQLException exception){
		return new DataAccessException(exception.toString()) {
		};
		
	}
}
