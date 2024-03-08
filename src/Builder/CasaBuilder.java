package Builder;

public abstract class CasaBuilder {

	protected CasaProduct casa = new CasaProduct();
	public abstract void buildTijolo();
	public abstract void buildCimento();
	public abstract void buildAreia();
	public abstract void buildPedra();
	public CasaProduct getCasa() {
		return casa;
	}
}