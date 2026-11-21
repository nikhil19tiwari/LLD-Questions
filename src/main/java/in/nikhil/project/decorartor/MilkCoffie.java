package in.nikhil.project.decorartor;

public class MilkCoffie extends CoffieDecorator{

	public MilkCoffie(Coffie base) {
		super(base);
	}
	@Override
	public int price() {
		
		return coffie.price()+5;
	}

	@Override
	public String name() {
		return coffie.name()+" milk";
	}

}
