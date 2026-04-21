package com.nikhil.lld.parkinglot;

public class ParkingSpot {
	private Integer spotId;
	private VechileType vechileType;
	private boolean isAvaliable;
	private Integer nearSpot;
	
	public ParkingSpot(Integer spotId,VechileType vechileType,boolean isAvaliable,Integer nearSpot) {
		this.spotId = spotId;
		this.vechileType = vechileType;
		this.isAvaliable = isAvaliable;
		this.nearSpot = nearSpot;
	}
	public Integer getSpotId() {
		return spotId;
	}
	public VechileType getVechileType() {
		return vechileType;
	}
	public boolean isAvaliable() {
		return isAvaliable;
	}
	public Integer getNearSpot() {
		return nearSpot;
	}
	
}
