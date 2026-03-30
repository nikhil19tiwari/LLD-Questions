package com.nikhil.lld.parkinglot;

public class Vehcile {

	private Integer vehcileNumber;
	private VehcileType vehcileType;
	Vehcile(Integer vehcileNumber,VehcileType vehcileType){
		this.vehcileNumber = vehcileNumber;
		this.vehcileType = vehcileType;
	}
	public Integer getVehcileNumber() {
		return vehcileNumber;
	}
	public void setVehcileNumber(Integer vehcileNumber) {
		this.vehcileNumber = vehcileNumber;
	}
	public VehcileType getVehcileType() {
		return vehcileType;
	}
	public void setVehcileType(VehcileType vehcileType) {
		this.vehcileType = vehcileType;
	}
	
}
