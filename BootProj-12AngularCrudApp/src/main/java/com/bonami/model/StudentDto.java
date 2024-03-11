package com.bonami.model;

public class StudentDto {

	private String sname;
	private String address;
	private String dept;
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	public StudentDto(String sname, String address, String dept) {
		this.sname = sname;
		this.address = address;
		this.dept = dept;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "StudentDto [sname=" + sname + ", address=" + address + ", dept=" + dept + "]";
	}
	
}
