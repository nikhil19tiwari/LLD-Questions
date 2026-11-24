package in.nikhil.project.pizzadelivery;

public abstract class Decorator implements Pizza{
	public Pizza pizza;
	public Decorator(Pizza pizza) {
		this.pizza = pizza;
	}
}
