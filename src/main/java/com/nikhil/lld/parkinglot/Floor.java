package com.nikhil.lld.parkinglot;

import java.util.List;

public class Floor {

	private Integer floorId;
	private List<ParkingSpot> parkingSpot;
	
	Floor(Integer floorId,List<ParkingSpot> parkingSpot){
		this.floorId = floorId;
		this.parkingSpot = parkingSpot;
	}

	public Integer getFloorId() {
		return floorId;
	}

	public void setFloorId(Integer floorId) {
		this.floorId = floorId;
	}

	public List<ParkingSpot> getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(List<ParkingSpot> parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	
}
