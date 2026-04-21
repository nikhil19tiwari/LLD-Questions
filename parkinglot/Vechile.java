package com.nikhil.lld.parkinglot;

public class Vechile {

	private Integer vechileId;
	private Integer vechileNumber;
	
	public Integer getVechileId() {
		return vechileId;
	}
	
	public Integer getVechileNumber() {
		return vechileNumber;
	}

	public Vechile(Integer vechileId,Integer vechileNumber) {
		this.vechileId = vechileId;
		this.vechileNumber = vechileNumber;
	}
}
