package householdapplicances;

public class Light extends Appliance {

	private boolean isSwitchedOn;
	private int power;
	
	public Light(boolean isSwitchedOn) {

		this.isSwitchedOn = isSwitchedOn;
	}

	@Override
	public int powerConsumption() {
		if (isSwitchedOn)
			return power=2;
		return power=0;
	}

	
	public int getPower() {
		return power;
	}
}
