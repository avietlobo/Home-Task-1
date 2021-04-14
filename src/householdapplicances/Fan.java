package householdapplicances;

public class Fan extends Appliance {

	private boolean isSwitchedOn;
	private int power;
	
	public int getPower() {
		return power;
	}

	public Fan(boolean isSwitchedOn) {

		this.isSwitchedOn = isSwitchedOn;
	}

	@Override
	public int powerConsumption() {
		if (isSwitchedOn)
			return power=1;
		return power=0;
	}

	
}
