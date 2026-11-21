package in.nikhil.project.decorartor;

public class Main {
	public static void main(String[] args) {
		BaseCoffie c =  new CoffieBeans(new SugerCoffie(new SugerCoffie(new SugerCoffie(new MilkCoffie(new BaseCoffie())))));
		System.out.println(c.name() + "  "+ c.price());
		
	}
}
