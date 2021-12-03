package com.ibu.couponinfo.model;

public class CouponInfo {
	
	private String id;
	private String c1;
	private int count;
	private String id1;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getId1() {
		return id1;
	}
	public void setId1(String id1) {
		this.id1 = id1;
	}
	public CouponInfo(String id, String c1, int count, String id1) {
		super();
		this.id = id;
		this.c1 = c1;
		this.count = count;
		this.id1 = id1;
	}
	

}
