package com.nikhil.lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotLLD {

	public static void main(String[] args) {

		List<ParkingSpot> parkingSpot =new ArrayList<>();
		int idx =0;
		for(int i=0;i<600;i++) {
			parkingSpot.add(new ParkingSpot(idx++,VehicleType.TWO_WHEELER));
		}
		for(int i=0;i<400;i++) {
			parkingSpot.add(new ParkingSpot(idx++,VehicleType.FOUR_WHEELER));
		}
		
		
		Vehicle bike1 = new Vehicle(120,VehicleType.TWO_WHEELER);
		Vehicle bike2 = new Vehicle(121,VehicleType.TWO_WHEELER);
		Vehicle bike3 = new Vehicle(122,VehicleType.TWO_WHEELER);
		Vehicle bike4 = new Vehicle(123,VehicleType.TWO_WHEELER);
		Vehicle bike5 = new Vehicle(124,VehicleType.TWO_WHEELER);
		
		Vehicle car = new Vehicle(130,VehicleType.FOUR_WHEELER);
		Vehicle car2 = new Vehicle(131,VehicleType.FOUR_WHEELER);
		Vehicle car3 = new Vehicle(132,VehicleType.FOUR_WHEELER);
		Vehicle car4 = new Vehicle(133,VehicleType.FOUR_WHEELER);
		Vehicle car5 = new Vehicle(134,VehicleType.FOUR_WHEELER);
	
		ParkingSpotManager p1 = new ParkingSpotManager(parkingSpot);
		p1.parkVehicle(car3);
		p1.parkVehicle(car5);
		p1.parkVehicle(bike5);
		p1.unPark(601);
		
		
		
	}

}
