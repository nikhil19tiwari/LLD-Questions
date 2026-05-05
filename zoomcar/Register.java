package com.nikhil.lld.zoomcar;

import java.time.LocalDate;
import java.util.Map;
import java.util.Queue;

public class Register {
    private Store store;
	public Register(Store store) {
		this.store =store;
	}
	public String register(VechileCategoary category, FuleType fuel, LocalDate to) {
	    Map<FuleType, Queue<Vechile>> map = store.getAvaialbeVechile().get(category);
	    Queue<Vechile> queue = map.get(fuel);
	    if(queue == null || queue.isEmpty()) return "No vehicle available";
	    Vechile v = queue.poll();
	    store.getRentedCars().put(v.getVechileNumber(), v);
	    v.setAvailable(false);
	    v.setFromDate(LocalDate.now());
	    v.setToDate(to);
	    return "Booked Successfully";
	}
}
