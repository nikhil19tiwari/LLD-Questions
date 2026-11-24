package in.nikhil.project.pizzadelivery;

public class Main {

	public static void main(String []args) {
		Pizza p = new Magrita(new Jelipano(new Magrita(new BasePizzaImpl())));
		System.out.println(p.name());
		System.out.println(p.price());
	}
}
