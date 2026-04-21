package com.nikhil.lld.parkinglot;

import java.util.List;

public class Floor {

	private Integer floorId;
	private List<ParkingSpot> parkingSpotList;
	public Floor(Integer floorId,List<ParkingSpot> parkingSpotList) {
		this.floorId = floorId;
		this.parkingSpotList = parkingSpotList;
	}
	public Integer getFloorId() {
		return floorId;
	}
	public List<ParkingSpot> getParkingSpotList() {
		return parkingSpotList;
	}
	
}
