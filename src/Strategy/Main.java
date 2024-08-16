package Strategy;

public class Main {

	private static void execute(IStrategy strategy) {
		strategy.solve();
	}

	public static void main(String[] args) {

		float distance = 100;

		TransportationContext context = new TransportationContext();

		context.setStrategy(new Car());
		System.out.println(context.calculateArrivalTime(distance));

		context.setStrategy(new Bus());
		System.out.println(context.calculateArrivalTime(distance));

		context.setStrategy(new Bicycle());
		System.out.println(context.calculateArrivalTime(distance));

		IStrategy[] algorithms = { new FOO(), new BAR() };
		for (IStrategy algorithm : algorithms) {
			execute(algorithm);
		}
	}

}
