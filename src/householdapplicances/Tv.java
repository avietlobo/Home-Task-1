package householdapplicances;

public class Tv extends Appliance {

	private boolean isSwitchedOn;
	private int power;

	public Tv(boolean isSwitchedOn) {

		this.isSwitchedOn = isSwitchedOn;
	}
	
	

	public boolean isSwitchedOn() {
		return isSwitchedOn;
	}



	public int getPower() {
		return power;
	}



	@Override
	public int powerConsumption() {
		if (isSwitchedOn)
			return power=3;
		return power=0;
	}

	
}
