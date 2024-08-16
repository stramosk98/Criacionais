package Strategy;

public class TransportationContext {
	private ITransportation strategy;

	public ITransportation getStrategy() {
		return strategy;
	}

	public void setStrategy(ITransportation strategy) {
		this.strategy = strategy;
	}

	public String calculateArrivalTime(float distance) {
		return strategy.calculateTime(distance);
	}
}
