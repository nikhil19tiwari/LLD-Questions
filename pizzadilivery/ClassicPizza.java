package com.nikhil.lld.pizzadilivery;

public class ClassicPizza implements BasePizza {

	@Override
	public String Description() {
		return "Classic Pizza";
	}

	@Override
	public double GetPrice() {
		return 90;
	}

}
