package com.lau.pojo;

public class PropertyValue {

	private int id;
	private int pid;		//商品id
	private int ptid;		//属性id
	private String value;	//属性值
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
	public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "PropertyValue [id=" + id + ", pid=" + pid + ", ptid=" + ptid + ", value=" + value + "]";
	}
	
}
