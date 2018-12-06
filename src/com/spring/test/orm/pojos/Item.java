package com.spring.test.orm.pojos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@SuppressWarnings("serial")
@Component("item")
@Scope("prototype")
@Table(name="SprOrmItems")
@Entity
public class Item implements Serializable {
	
	@Id
	private int itemCode;
	private String itemName;
	private double itemPrice;
	public Item() {
		super();
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemName=" + itemName
				+ ", itemPrice=" + itemPrice + "]";
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Item(int itemCode, String itemName, double itemPrice) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	

}
