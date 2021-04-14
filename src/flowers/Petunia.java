package flowers;

public class Petunia implements Flower {

	private int count;
	private double cost;
	public static final String name = "PETUNIA";

	public Petunia(int count) {
		this.count = count;
	}

	@Override
	public double cost() {
		return cost = count * 12;
	}

}
