package Builder;

public class ConstruvaleBuilder extends CasaBuilder {

	@Override
	public void buildTijolo() {
		casa.setTijolo(1500);
	}

	@Override
	public void buildCimento() {
		casa.setCimento(5);
	}

	@Override
	public void buildAreia() {
		casa.setAreia(15000);
	}

	@Override
	public void buildPedra() {
		casa.setPedra(10000);
	}

}
