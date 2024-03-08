package Builder;

public class ConstrucaoDirector {
	
	protected CasaBuilder construtora;
	
	public ConstrucaoDirector(CasaBuilder construtora) {
		this.construtora = construtora;
	}
	
	public void construirCasa() {
		construtora.buildTijolo();
		construtora.buildCimento();
		construtora.buildAreia();
		construtora.buildPedra();
	}
	
	public CasaProduct getCasa() {
		return construtora.getCasa();
	}

}