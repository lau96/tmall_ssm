package com.lau.pojo;

public class OrderItem {

	private int id;
	private int pid;		//��Ʒid
	private int oid;		//����id
	private int uid;		//�û�id
	private int number;		//��Ʒ����
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
