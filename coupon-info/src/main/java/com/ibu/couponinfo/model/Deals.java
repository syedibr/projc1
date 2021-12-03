package com.ibu.couponinfo.model;

public class Deals {
 
	private String id;
	private int count;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Deals(String id, int count) {
		super();
		this.id = id;
		this.count = count;
	}
	public Deals()
	{
		
	}
	public String toString()
	{
		return "["+"id is "+id+" number of coupons at available "+count+"]";
	}
}
