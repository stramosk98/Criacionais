package Builder;

public class Main {

	public static void main(String[] args) {
		
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new ChevroletBuilder());
		concessionaria.construirCarro();
		CarroProduct carro = concessionaria.getCarro();
		System.out.println(carro);
		
		concessionaria = new ConcessionariaDirector(new ToyotaBuilder());
		concessionaria.construirCarro();
		carro = concessionaria.getCarro();
		System.out.println(carro);

		// 
		
		ConstrucaoDirector construtora = new ConstrucaoDirector(new ConstruvaleBuilder());
		construtora.construirCasa();
		CasaProduct casa = construtora.getCasa();
		System.out.println(casa);
	}

}
