package Strategy;

public class Car implements ITransportation {

	@Override
	public String calculateTime(float distance) {
		float transportSpeed = 50;
		return "You will arrive at your destination in: "
		   		+ (distance / transportSpeed) * 60 + " minutes";
	}

}
