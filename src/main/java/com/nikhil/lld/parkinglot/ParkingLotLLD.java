package com.nikhil.lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotLLD {
	public static void main(String []args) {
		List<ParkingSpot> spotList = new ArrayList<>();
		for(int idx=1;idx<=600;idx++) {
			spotList.add(new ParkingSpot(idx,true,VehcileType.TWO_WEELER));
		}
		for(int idx=601;idx<=1000;idx++) {
			spotList.add(new ParkingSpot(idx,true,VehcileType.TWO_WEELER));
		}
		Vehcile bike = new Vehcile(62,VehcileType.TWO_WEELER);
		Vehcile bike1 = new Vehcile(162,VehcileType.TWO_WEELER);
		Vehcile car = new Vehcile(892,VehcileType.FOUR_WEELER);
		
		ParkingSpotManager psm = new ParkingSpotManager(spotList);
		psm.parkVehicle(bike);
		psm.parkVehicle(bike1);
		psm.parkVehicle(car);
		psm.unParkVehcile(62);
		
		
	}
}
