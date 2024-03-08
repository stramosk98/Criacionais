package AbstractFactory;

public class FactoryPrimarias implements IFactoryCores {

	@Override
	public IAzul pintarAzul() {
		return new Azul();
	}

	@Override
	public IAmarelo pintarAmarelo() {
		return new Amarelo();
	}

	@Override
	public IVermelho pintarVermelho() {
		return new Vermelho();
	}
	
}