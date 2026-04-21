package com.nikhil.lld.parkinglot;

import java.util.ArrayList;
import java.util.List;
public class ParkingSpotManager {

    public ParkingSpotManager() {
        initialize();
    }

    private void initialize() {

        List<Floor> floors = new ArrayList<>();

        for (int floorId = 0; floorId < 4; floorId++) {

            List<ParkingSpot> listOfParkingSpot = new ArrayList<>();

            // 2-wheeler spots
            for (int i = 0; i < 500; i++) {
                ParkingSpot parkingSpot =
                        new ParkingSpot(i, VechileType.TWOWHEELER, true,1);
                listOfParkingSpot.add(parkingSpot);
            }

            // 4-wheeler spots
            for (int i = 500; i < 1000; i++) {
                ParkingSpot parkingSpot =
                        new ParkingSpot(i, VechileType.FOURWHEELER, true,2);
                listOfParkingSpot.add(parkingSpot);
            }

            Floor f = new Floor(floorId, listOfParkingSpot);
            floors.add(f);
        }

        ParkingLot lot = new ParkingLot(floors);

        // TEST
        Vechile v1 = new Vechile(101, 111);
        Vechile v2 = new Vechile(102, 222);

        lot.park(VechileType.TWOWHEELER, v1);
        lot.park(VechileType.FOURWHEELER ,v2);

        lot.unPark(101);
    }

    public static void main(String[] args) {
        new ParkingSpotManager();
    }
}