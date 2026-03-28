package com.nikhil.lld.parkinglot;

public class ParkingSpot {

	private int id;
	private boolean isAvaliable;
	private VehicleType vehicleType;
	
	public ParkingSpot(int id,VehicleType vehicleType) {
		this.vehicleType = vehicleType;
		this.id = id;
		isAvaliable = true;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setAvaliable(boolean isAvaliable) {
		this.isAvaliable = isAvaliable;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public boolean getIsAvaliable() {
		return isAvaliable;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
}
