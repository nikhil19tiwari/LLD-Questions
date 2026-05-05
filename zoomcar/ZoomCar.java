package com.nikhil.lld.zoomcar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZoomCar {
    public static void main(String[] args) {

        // Step 1: Create Specifications
        List<VechileSpecification> specs = new ArrayList<>();
        specs.add(new VechileSpecification("Swift", 25, 5000, "Good"));
        specs.add(new VechileSpecification("XUV700", 15, 8000, "Excellent"));
        specs.add(new VechileSpecification("i20", 20, 6000, "Good"));

        // Step 2: Create Vehicles
        List<Vechile> vehicles = new ArrayList<>();

        vehicles.add(new Vechile(1, 101, 2000, specs.get(0), true, "Mumbai",
                FuleType.PETROL, null, null, VechileCategoary.HATCHBACK));

        vehicles.add(new Vechile(2, 102, 3000, specs.get(1), true, "Mumbai",
                FuleType.DISEL, null, null, VechileCategoary.SUV));

        vehicles.add(new Vechile(3, 103, 1800, specs.get(2), true, "Mumbai",
                FuleType.PETROL, null, null, VechileCategoary.SEDAN));

        vehicles.add(new Vechile(4, 104, 2200, specs.get(0), true, "Mumbai",
                FuleType.EV, null, null, VechileCategoary.HATCHBACK));

        // Step 3: Create Store
        Store store = new Store(vehicles);

        // Step 4: Show Available Vehicles
        System.out.println("----- Available Vehicles -----");
        store.showVechiles();

        // Step 5: Create Register (Booking Service)
        Register register = new Register(store);

        // Step 6: Book a Vehicle
        System.out.println("\n----- Booking Vehicle -----");
        String result = register.register(
                VechileCategoary.HATCHBACK,
                FuleType.PETROL,
                LocalDate.now().plusDays(2)
        );
        System.out.println(result);

        // Step 7: Show Vehicles After Booking
        System.out.println("\n----- Vehicles After Booking -----");
        store.showVechiles();

        // Step 8: Show Rented Cars
        System.out.println("\n----- Rented Cars -----");
        store.getRentedCars().forEach((k, v) -> {
            System.out.println("Vehicle Number: " + k + " -> " + v);
        });
    }
}