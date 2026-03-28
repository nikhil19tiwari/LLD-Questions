package com.nikhil.lld.parkinglot;

public class Vehicle {

	public int vehileNumber;
	public VehicleType vehicleType;
	Vehicle(int vehicleNumber,VehicleType vehicleType){
		this.vehileNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}
	public int getVehileNumber() {
		return vehileNumber;
	}
	
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	
	
}
