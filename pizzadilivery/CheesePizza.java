package com.nikhil.lld.pizzadilivery;

public class CheesePizza extends PizzaDecorator {
	public CheesePizza(BasePizza basePizza) {
		super(basePizza);
	}
	@Override
	public String Description() {
		return basePizza.Description() +", Cheese";
	}
	
	@Override
	public double GetPrice() {
		return basePizza.GetPrice()+40;
	}

}
