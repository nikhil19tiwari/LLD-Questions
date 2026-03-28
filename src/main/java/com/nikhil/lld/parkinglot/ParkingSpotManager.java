package com.nikhil.lld.parkinglot;

import java.util.Iterator;
import java.util.List;

public class ParkingSpotManager {
	List<ParkingSpot> parkingSpot;
	ParkingSpotManager(List<ParkingSpot> parkingSpot){
		this.parkingSpot = parkingSpot;
	}
	public void parkVehicle(Vehicle vehcile) {
		for(ParkingSpot spot: parkingSpot) {
			if(spot.getIsAvaliable() && spot.getVehicleType() == vehcile.getVehicleType()) {
				spot.setAvaliable(false);
				System.out.println("Your "+vehcile.getVehicleType()+"Parking at this :"+spot.getId()+"is parked");
				break;
			}
		}
	}
	public void unPark(Integer id) {
		for(ParkingSpot spot:parkingSpot) {
			if(!spot.getIsAvaliable()&& id.equals(spot.getId())) {
				spot.setAvaliable(true);
				System.out.println("Your "+spot.getId()+" unPark at this :"+id+"is parked");
				break;
			}
		}
	}
	public void deleteSpot(Integer id) {
		Iterator<ParkingSpot> iterator = parkingSpot.iterator();
		while(iterator.hasNext()) {
			ParkingSpot sp = iterator.next();
			if(id.equals(sp.getId())) {
				iterator.remove();
			}
		}
	}


	
}
