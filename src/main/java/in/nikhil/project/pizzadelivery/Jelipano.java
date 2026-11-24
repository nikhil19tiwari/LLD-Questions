package in.nikhil.project.pizzadelivery;

public class Jelipano  extends Decorator {

	public Jelipano(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int price() {
		return pizza.price()+20;
	}

	@Override
	public String name() {
		return pizza.name()+" Jalipano";
	}

}