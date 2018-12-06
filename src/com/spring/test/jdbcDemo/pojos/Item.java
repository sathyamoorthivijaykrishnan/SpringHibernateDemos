package com.spring.test.jdbcDemo.pojos;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component("item")
@Scope("prototype")
public class Item implements Serializable {

	@Override
	public String toString() {
		return "Item [icode=" + iCode + ", iName=" + iName + ", iprice="
				+ iPrice + "]";
	}
	private int iCode;
	private String iName;
	private double iPrice;
	
	public Item() {
		super();
	}
	
	public Item(int icode, String iName, double iprice) {
		super();
		this.iCode = icode;
		this.iName = iName;
		this.iPrice = iprice;
	}
	
	public int getIcode() {
		return iCode;
	}
	public void setIcode(int icode) {
		this.iCode = icode;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public double getIprice() {
		return iPrice;
	}
	public void setIprice(double iprice) {
		this.iPrice = iprice;
	}
	
}
