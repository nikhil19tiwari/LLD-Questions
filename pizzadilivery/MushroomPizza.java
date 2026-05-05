package com.nikhil.lld.pizzadilivery;

public class MushroomPizza extends PizzaDecorator{

	public MushroomPizza(BasePizza basePizza) {
		super(basePizza);
	}
	@Override
	public String Description() {
		return basePizza.Description() +", Mushroom";
	}
	
	@Override
	public double GetPrice() {
		return basePizza.GetPrice()+60;
	}
	
}
