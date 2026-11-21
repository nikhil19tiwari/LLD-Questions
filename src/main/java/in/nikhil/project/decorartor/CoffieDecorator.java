package in.nikhil.project.decorartor;

public abstract class CoffieDecorator implements Coffie{

	Coffie coffie;
	public CoffieDecorator(Coffie coffie) {
		this.coffie = coffie;
	}
	
}
