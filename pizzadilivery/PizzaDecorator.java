package com.nikhil.lld.pizzadilivery;

public abstract class PizzaDecorator implements BasePizza {

	protected BasePizza basePizza;
	PizzaDecorator(BasePizza basePizza){
		this.basePizza = basePizza;
	}
	
	@Override
	public String Description() {
		return basePizza.Description();
	}

	@Override
	public double GetPrice() {
		return basePizza.GetPrice();
	}

}
