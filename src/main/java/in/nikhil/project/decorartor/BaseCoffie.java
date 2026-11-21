package in.nikhil.project.decorartor;

public class BaseCoffie implements Coffie {

	@Override
	public int price() {
		return 10;
	}

	@Override
	public String name() {
		return "Base";
	}

}
