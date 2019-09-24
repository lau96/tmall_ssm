package com.lau.pojo;

import java.sql.Timestamp;

public class Product {

	private int id;
	private String name;
	private String subTitle;
	private double orignalPrice;	//原价
	private double promotePrice;	//促销价
	private int stock;				//存货
	private int cid;				//商品类型id
	private Timestamp createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public double getOrignalPrice() {
		return orignalPrice;
	}
	public void setOrignalPrice(double orignalPrice) {
		this.orignalPrice = orignalPrice;
	}
	public double getPromotePrice() {
		return promotePrice;
	}
	public void setPromotePrice(double promotePrice) {
		this.promotePrice = promotePrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", subTitle=" + subTitle + ", orignalPrice=" + orignalPrice
				+ ", promotePrice=" + promotePrice + ", stock=" + stock + ", cid=" + cid + ", createDate=" + createDate
				+ "]";
	}
	
}
