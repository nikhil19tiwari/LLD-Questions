package in.nikhil.project.decorartor;

public class CoffieBeans extends CoffieDecorator{
	public CoffieBeans(Coffie base) {
		super(base);
	}
	@Override
	public int price() {
		
		return coffie.price()+9;
	}

	@Override
	public String name() {
		return coffie.name()+" beans";
	}

}
