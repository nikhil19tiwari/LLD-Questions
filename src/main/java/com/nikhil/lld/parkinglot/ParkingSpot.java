package com.nikhil.lld.parkinglot;

public class ParkingSpot {

	private Integer id;
	private boolean isAvaliable;
	private VehcileType vehcileType;
	
	public ParkingSpot(Integer id, boolean isAvaliable, VehcileType vehcileType) {
		super();
		this.id = id;
		this.isAvaliable = isAvaliable;
		this.vehcileType = vehcileType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isAvaliable() {
		return isAvaliable;
	}
	public void setAvaliable(boolean isAvaliable) {
		this.isAvaliable = isAvaliable;
	}
	public VehcileType getVehcileType() {
		return vehcileType;
	}
	public void setVehcileType(VehcileType vehcileType) {
		this.vehcileType = vehcileType;
	}
	
}
