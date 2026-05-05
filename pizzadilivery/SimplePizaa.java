package com.nikhil.lld.pizzadilivery;

public class SimplePizaa implements BasePizza {

	@Override
	public String Description() {
		return "Simple Pizza";
	}

	@Override
	public double GetPrice() {
		return 80;
	}

}
