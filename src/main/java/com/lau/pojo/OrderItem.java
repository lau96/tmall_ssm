package com.lau.pojo;

public class OrderItem {

	private int id;
	private int pid;		//商品id
	private int oid;		//订单id
	private int uid;		//用户id
	private int number;		//商品数量
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", pid=" + pid + ", oid=" + oid + ", uid=" + uid + ", number=" + number + "]";
	}
	
}
