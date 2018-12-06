package com.spring.test.jdbcDemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.spring.test.jdbcDemo.pojos.Item;
import com.spring.test.jdbcDemo.rowMappers.ItemRowMapper;


@Repository("itemDAO3")
public class ItemDAO3 {
	
	private DataSource dataSource;
	
	@Autowired
	@Qualifier("itemRowMapper")	
	private ItemRowMapper rowMapper;
	
	private SqlUpdate insertQry;
	private SqlUpdate updateQry;
	private SqlUpdate deleteQry;
	
	private MappingSqlQuery<Item> getItemQry;
	private MappingSqlQuery<Item> getAllItemQry;
	
	@Autowired
	@Qualifier("dataSource")
	@Required 
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
		initQrys();
	}

	private void initQrys() {
		insertQry = new SqlUpdate(dataSource,"insert into Item values(?,?,?)");
		updateQry = new SqlUpdate(dataSource,"update item set iName=?,iPrice=? where iCode=?");
		deleteQry = new SqlUpdate(dataSource,"delete from item where iCode=?");
		
		SqlParameter param1 = new SqlParameter("icode",Types.INTEGER);
		SqlParameter param2 = new SqlParameter("iname",Types.VARCHAR);
		SqlParameter param3 = new SqlParameter("iprice",Types.DOUBLE);
		
		insertQry.declareParameter(param1);
		insertQry.declareParameter(param2);
		insertQry.declareParameter(param3);
		insertQry.compile();
		
		updateQry.declareParameter(param2);
		updateQry.declareParameter(param3);
		updateQry.declareParameter(param1);
		updateQry.compile();
		
		deleteQry.declareParameter(param1);
		deleteQry.compile();
		
		getAllItemQry = new MappingSqlQuery<Item>(dataSource,"select icode,iname,iprice from item"){
			protected Item mapRow(ResultSet rs ,int row ) throws SQLException{
				return rowMapper.mapRow(rs, row);
			}
		};
		getItemQry = new MappingSqlQuery<Item>(dataSource,"select icode,iname,iprice from item where icode=?"){
			protected Item mapRow(ResultSet rs ,int row ) throws SQLException{
				return rowMapper.mapRow(rs, row);
			}
		};
		getItemQry.declareParameter(param1);
		getItemQry.compile();
	}
 	
	public void addItem(Item item){
		insertQry.update(item.getIcode(),item.getiName(),item.getIprice());
	}
	public void removeItem(Item item){
		deleteQry.update(item.getIcode());
	}
	public void updateItem(Item item){
		updateQry.update(item.getiName(),item.getIprice(),item.getIcode());
	}
	public Item getItem(int icode){
		
		return getItemQry.findObject(icode);
	}
	public List<Item> getItems(){
		return getAllItemQry.execute();
	}

	

}
