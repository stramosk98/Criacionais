package Strategy;

public class Bicycle implements ITransportation {

	@Override
	public String calculateTime(float distance) {
		float transportSpeed = 25;
		return "You will arrive at your destination in: "
				   + (distance / transportSpeed) * 60 + " minutes";
	}

}

