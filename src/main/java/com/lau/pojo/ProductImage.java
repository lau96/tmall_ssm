package com.lau.pojo;

public class ProductImage {

	private int id;
	private int pid;	//��Ʒid
	private String type;//ͼƬ����	type_single		type_detail
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ProductImage [id=" + id + ", pid=" + pid + ", type=" + type + "]";
	}
	
}
