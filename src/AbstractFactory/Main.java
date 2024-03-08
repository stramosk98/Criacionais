package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryPrimarias primaria = new FactoryPrimarias();
		IAzul azul = primaria.pintarAzul();
		IAmarelo amarelo = primaria.pintarAmarelo();
		IVermelho vermelho = primaria.pintarVermelho();
		
		azul.exibir();
		amarelo.exibir();
		vermelho.exibir();
	}

}
