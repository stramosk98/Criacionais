package FluentInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NotaFiscal notaFiscal = new NotaFiscal()
		            .empresa("Mercado Tabajara")
		            .cliente("Cliente VIP")
		            .item("Leite")
		            .item("Arroz")
		            .item("Açucar");
		        
		notaFiscal.emitir();
		
	   Carro carro = new Carro()
	            .marca("Toyota")
	            .cor("Cinza")
	            .modelo("Corolla")
	            .ano(2021);

	   carro.exibirCarro();
	}

}
