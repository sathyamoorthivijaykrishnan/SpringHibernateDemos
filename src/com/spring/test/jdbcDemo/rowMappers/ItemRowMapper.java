package com.spring.test.jdbcDemo.rowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.test.jdbcDemo.pojos.Item;

@Repository("itemRowMapper")
public class ItemRowMapper implements RowMapper<Item> {

	public Item mapRow(ResultSet rs, int rowId) throws SQLException {
		
		return new Item(rs.getInt("icode"),rs.getString("iname"),rs.getDouble("iprice"));
	}

}
