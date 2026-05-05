package com.nikhil.lld.zoomcar;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Store {

	private final List<Vechile> vechiles;
	private VechileCategoary vechileCategoary;
	private Map<VechileCategoary,Map<FuleType,Queue<Vechile>>> avaialbeVechile;
	private Map<Integer,Vechile> rentedCars;
	
	public Store(List<Vechile> vechiles) {
		this.vechiles = vechiles;
		this.avaialbeVechile = new HashMap<>();
		this.rentedCars = new HashMap<>();
		initlize();
	}
	public void initlize() {
    for(Vechile v :vechiles) {
    	//create the catagory if it is not created
      	if(!avaialbeVechile.containsKey(v.getVechileCategory())) {
      		avaialbeVechile.put(v.getVechileCategory(),new HashMap<>());	
      	}
      	Map<FuleType,Queue<Vechile>> map = avaialbeVechile.get(v.getVechileCategory());
      	if(!map.containsKey(v.getFuleType())) {
      		map.put(v.getFuleType(),new LinkedList<>());
      	}
      	map.get(v.getFuleType()).offer(v);
    }
	}
	
	
	public VechileCategoary getVechileCategoary() {
		return vechileCategoary;
	}
	public Map<VechileCategoary, Map<FuleType, Queue<Vechile>>> getAvaialbeVechile() {
		return avaialbeVechile;
	}
	public Map<Integer, Vechile> getRentedCars() {
		return rentedCars;
	}
	public List<Vechile> getVechiles() {
		return vechiles;
	}
	public boolean isAvailable(Integer VechileNumber) {
		if(rentedCars.containsKey(VechileNumber)) {
			return false;
		}
		return true;
	}
	
	public void setStatus(Vechile v) {
		v.setAvailable(false);
	}
	public boolean getStatus(Vechile v) {
		return v.isAvailable();
	}
	public void showVechiles() {
		avaialbeVechile.forEach((category,fuleMap)->{
			System.out.println("category ::"+ category);
			fuleMap.forEach((fuleT,vechiles)->{
				System.out.println("FuleType ::"+ fuleT);
				vechiles.forEach(v->{
					System.out.println("Vechile"+v);
				});	
			});
		});
	}
	

	
}
