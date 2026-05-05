package com.nikhil.lld.zoomcar;

public class VechileSpecification {

	private String modalName;
	private double milage;
	private double DistenceCover;
	private String condition;
	
	public VechileSpecification(String modalName,double milage,double DistenceCover,String condition) {
		this.modalName = modalName;
		this.milage = milage;
		this.DistenceCover = DistenceCover;
		this.condition = condition;
	}

	public String getModalName() {
		return modalName;
	}

	public void setModalName(String modalName) {
		this.modalName = modalName;
	}
	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public double getDistenceCover() {
		return DistenceCover;
	}

	public void setDistenceCover(double distenceCover) {
		DistenceCover = distenceCover;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
}
