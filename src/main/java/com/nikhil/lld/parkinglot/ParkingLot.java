package com.nikhil.lld.parkinglot;

import java.util.List;

public class ParkingLot {
	private List<Floor> floor;
	public ParkingLot(List<Floor> floor) {
		this.floor = floor;
	}
	public List<Floor> getFloor() {
		return floor;
	}
}
