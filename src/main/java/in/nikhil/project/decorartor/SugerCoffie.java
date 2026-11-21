package in.nikhil.project.decorartor;

public class SugerCoffie  extends CoffieDecorator{
	public SugerCoffie(Coffie base) {
	super(base);
	}
	@Override
	public int price() {
		
		return coffie.price()+7;
	}

	@Override
	public String name() {
		return coffie.name()+" suger";
	}

}
