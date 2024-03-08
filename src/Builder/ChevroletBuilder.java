package Builder;

public class ChevroletBuilder  extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.setPreco(33.000);
	}

	@Override
	public void buildDscMotor() {
		carro.setDscMotor("1.4 Flex");
	}

	@Override
	public void buildAnoFabricacao() {
		carro.setAnoFabricacao(2011);
	}

	@Override
	public void buildModelo() {
		carro.setModelo("Agile");
	}

	@Override
	public void buildMontadora() {
		carro.setMontadora("Chevrolet");
	}

}
