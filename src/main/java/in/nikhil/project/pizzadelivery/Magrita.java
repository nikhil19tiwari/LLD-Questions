package in.nikhil.project.pizzadelivery;

public class Magrita extends Decorator {

	public Magrita(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int price() {
		return pizza.price()+15;
	}

	@Override
	public String name() {
		return pizza.name()+" magrita";
	}

}
