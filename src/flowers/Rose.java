package flowers;

public class Rose implements Flower {

	private int count;
	private double cost;
	public static final String name = "ROSE";

	public Rose(int count) {
		this.count = count;
	}

	@Override
	public double cost() {
		return cost = count * 7;
	}

}
