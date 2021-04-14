package flowers;

public class Lily implements Flower {

	private int count;
	private double cost;
	public static final String name = "LILY";

	public Lily(int count) {
		this.count = count;
	}

	@Override
	public double cost() {
		return cost = count * 12;
	}

}
