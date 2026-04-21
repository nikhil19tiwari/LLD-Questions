package com.nikhil.lld.parkinglot;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

// Option1: is to literate over each floor and try to get the parking spot of that particular vechileType but this takes O(n^2) complexity which is not good
// Option2: use space or Map to store the parking spot 

public class ParkingLot {

	public List<Floor>floors;
	public Map<VechileType,Map<Integer,Queue<ParkingSpot>>> vacantSpace;
	public Map<Integer,ParkingSpot> occupied;
	 public Map<ParkingSpot, Integer> spotToFloor;
	public ParkingLot(List<Floor> floors) {
		this.floors = floors;
		vacantSpace = new HashMap<>();
		occupied = new HashMap<>();
		spotToFloor = new HashMap<>();
		initlize();
	}
	public void initlize() {
		for(Floor floor:floors) {
		 List<ParkingSpot> spots = floor.getParkingSpotList();
		 int floorId = floor.getFloorId();
		 for(ParkingSpot spot : spots) {
			 VechileType type = spot.getVechileType();
			 spotToFloor.put(spot, floorId);
			 if(!vacantSpace.containsKey(type)) {
				 vacantSpace.put(type, new HashMap());
			 }
			 Map<Integer,Queue<ParkingSpot>> f = vacantSpace.get(type);
			 if(!f.containsKey(floorId)) {
				 f.put(floorId, new LinkedList());
			 }
			 f.get(floorId).offer(spot); 			 
		 }
		}
	}
	public void park(VechileType vechileType,Vechile vechile) {
		Map<Integer,Queue<ParkingSpot>> floorList = vacantSpace.get(vechileType);
		  if (floorList == null) {
		        System.out.println("No parking available for this vehicle type");
		        return;
		    }
		for(Floor floor:floors){
			int floorId = floor.getFloorId();
			Queue<ParkingSpot> parkingSpot = floorList.get(floorId);
			if (parkingSpot != null && !parkingSpot.isEmpty()) {
			ParkingSpot spot = parkingSpot.poll();
			occupied.put(vechile.getVechileNumber(), spot);
			System.out.println("Allocated spot on floor " + floorId);
	        return;
		}	}
		 System.out.println("Parking Full for type: " + vechileType);
	}
	  public void unPark(int vechileNumber) {
	        ParkingSpot spot = occupied.get(vechileNumber);
	        if (spot == null) {
	            System.out.println("Vehicle not found");
	            return;
	        }
	        occupied.remove(vechileNumber);
	        VechileType type = spot.getVechileType();
	        int floorId = spotToFloor.get(spot);
	        Map<Integer, Queue<ParkingSpot>> floorMap = vacantSpace.get(type);
	        floorMap.get(floorId).offer(spot);
	        System.out.println("Unparked from Floor " + floorId);
	    }
	
}
