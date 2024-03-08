package Builder;

public class ToyotaBuilder  extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.setPreco(120.000);
	}

	@Override
	public void buildDscMotor() {
		carro.setDscMotor("2.0 Flex");
	}

	@Override
	public void buildAnoFabricacao() {
		carro.setAnoFabricacao(2020);
	}

	@Override
	public void buildModelo() {
		carro.setModelo("Corolla");
	}

	@Override
	public void buildMontadora() {
		carro.setMontadora("Toyota");
	}

}
