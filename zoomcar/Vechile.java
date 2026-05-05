package com.nikhil.lld.zoomcar;

import java.time.LocalDate;

public class Vechile {

	private Integer vechileId;
	private Integer vechileNumber;
	private double price;
	private VechileSpecification vechileSpecification;
	private boolean isAvailable = true;
	private String location;
	private FuleType fuleType;
	private LocalDate fromDate;
	private LocalDate toDate;
	public Vechile(Integer vechileId, Integer vechileNumber, double price, VechileSpecification vechileSpecification,
			boolean isAvailable, String location, FuleType fuleType, LocalDate fromDate, LocalDate toDate,
			VechileCategoary vechileCategory) {
		super();
		this.vechileId = vechileId;
		this.vechileNumber = vechileNumber;
		this.price = price;
		this.vechileSpecification = vechileSpecification;
		this.isAvailable = isAvailable;
		this.location = location;
		this.fuleType = fuleType;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.vechileCategory = vechileCategory;
	}
	private VechileCategoary vechileCategory;
	public FuleType getFuleType() {
		return fuleType;
	}
	public void setFuleType(FuleType fuleType) {
		this.fuleType = fuleType;
	}
	public VechileCategoary getVechileCategory() {
		return vechileCategory;
	}
	public void setVechileCategory(VechileCategoary vechileCategory) {
		this.vechileCategory = vechileCategory;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public Integer getVechileId() {
		return vechileId;
	}
	public void setVechileId(Integer vechileId) {
		this.vechileId = vechileId;
	}
	public Integer getVechileNumber() {
		return vechileNumber;
	}
	public void setVechileNumber(Integer vechileNumber) {
		this.vechileNumber = vechileNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public VechileSpecification getVechileSpecification() {
		return vechileSpecification;
	}
	public void setVechileSpecification(VechileSpecification vechileSpecification) {
		this.vechileSpecification = vechileSpecification;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
