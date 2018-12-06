package com.spring.test.xmlConfig.pojos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StationaryInventory {

	
	private List<Book> books;
	private Set<Disk> disks;
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Set<Disk> getDisks() {
		return disks;
	}
	public void setDisks(Set<Disk> disks) {
		this.disks = disks;
	}
	@Override
	public String toString() {
		return "StationaryInventory [books=" + books + ", disks=" + disks + "]";
	}
	public StationaryInventory() {
		super();
		books=new ArrayList<Book>();
		disks = new TreeSet<Disk>();
	}
	
	
	
}
