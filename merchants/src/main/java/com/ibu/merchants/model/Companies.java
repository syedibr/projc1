package com.ibu.merchants.model;

public class Companies {
	private String id;
	private String c1;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getC1() {
		return c1;
	}
	public void setC1(String c1) {
		this.c1 = c1;
	}
	public Companies()
	{
		
	}
	public Companies(String id, String c1) {
		super();
		this.id = id;
		this.c1 = c1;
	
	}
	
	

}
