package in.nikhil.project.pizzadelivery;

public class BasePizzaImpl implements Pizza {

	@Override
	public int price() {
		return 100;
	}

	@Override
	public String name() {
		return "Base";
	}

}
