package com.nikhil.lld.zoomcar;

public class User {

	private Integer id;
	private String name;
	private String address;
	private String phone;
	private String pan;
	private String adhar;
	private String location;
	public User(Integer id, String name, String address, String phone, String pan, String adhar, String location) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pan = pan;
		this.adhar = adhar;
		this.location = location;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
