package Strategy;

public class Bus implements ITransportation {

	@Override
	public String calculateTime(float distance) {
		float transportSpeed = 40;
		return "You will arrive at your destination in: "
		   		+ (distance / transportSpeed) * 60 + " minutes";
	}

}

