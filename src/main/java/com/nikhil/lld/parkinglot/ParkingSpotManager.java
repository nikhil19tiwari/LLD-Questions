package com.nikhil.lld.parkinglot;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ParkingSpotManager {

    private Map<VehcileType, Queue<ParkingSpot>> availableSpots;
	private Map<Integer,ParkingSpot> occupiedSpace;
	
	public ParkingSpotManager(List<ParkingSpot> parkingSpot) {
		availableSpots = new HashMap<>();
		occupiedSpace = new HashMap<>();
		availableSpots.put(VehcileType.TWO_WEELER, new LinkedList<>());
		availableSpots.put(VehcileType.FOUR_WEELER, new LinkedList<>());
		
		for(ParkingSpot spot : parkingSpot) {
			availableSpots.get(spot.getVehcileType()).offer(spot);
		}
	}
	
	public void parkVehicle(Vehcile vehicle) {
		Queue<ParkingSpot> queue = availableSpots.get(vehicle.getVehcileType());
		if(queue.isEmpty()) {
			System.out.println("No spot available");
			return;
		}
		ParkingSpot spot = queue.poll();
		  spot.setAvaliable(false);
		  occupiedSpace.put(spot.getId(), spot);
	       System.out.println("Parked at spot: " + spot.getId());
	}
	 public void unPark(int spotId) {
	        ParkingSpot spot = occupiedSpace.get(spotId);

	        if (spot == null) {
	            System.out.println("Invalid spot");
	            return;
	        }

	        spot.setAvaliable(true);
	        availableSpots.get(spot.getVehcileType()).offer(spot); // back to queue
	        occupiedSpace.remove(spotId);

	        System.out.println("Unparked from spot: " + spotId);
	    }	
}
//this approach take O(n) complexity to allot parking spot or unpark
//List<ParkingSpot> parkingSpot;
//
//public ParkingSpotManager(List<ParkingSpot> parkingSpot) {
// this.parkingSpot = parkingSpot;
//}
//public void parkVehicle(Vehcile vehicle) {
//
//    boolean parked = false;
//
//    for(ParkingSpot spot : parkingSpot) {
//        if(spot.getVehcileType() == vehicle.getVehcileType() && spot.isAvaliable()) {
//
//            spot.setAvaliable(false);
//            System.out.println("Vehicle parked at " + spot.getId());
//            parked = true;
//            break;
//        }
//    }
//
//    if(!parked) {
//        System.out.println("No spot available");
//    }
//}
//public void unParkVehcile(Integer spotId) {
//	
//	for(ParkingSpot spo : parkingSpot) {
//	    if(spo.getId().equals(spotId)) {
//	        parkingSpot.remove(spo);
//	    }
//	}
//}
//public void deleteParkingSpot(Integer spotId) {
//
//    Iterator<ParkingSpot> it = parkingSpot.iterator();
//
//    while(it.hasNext()) {
//        ParkingSpot spo = it.next();
//
//        if(spo.getId().equals(spotId)) {
//            it.remove();
//            System.out.println("Parking spot deleted " + spotId);
//            break;
//        }
//    }
// }	