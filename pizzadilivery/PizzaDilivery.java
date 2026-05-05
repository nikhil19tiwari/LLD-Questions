package com.nikhil.lld.pizzadilivery;

public class PizzaDilivery {
	public static void main(String []args) {
		
		BasePizza base = new MushroomPizza(new CheesePizza(new SimplePizaa()));
		System.out.println("Order: " + base.Description());
        System.out.println("Total Cost: " + base.GetPrice());
        
        BasePizza base1 = new CheesePizza(new CheesePizza(new MushroomPizza(new ClassicPizza())));
        System.out.println("Order: " + base1.Description());
        System.out.println("Total Cost: " + base1.GetPrice());
        
        
	}
}
