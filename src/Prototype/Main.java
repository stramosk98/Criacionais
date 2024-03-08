package Prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CachorroPrototype protCachorro = new CachorroPrototype();
		AnimalPrototype filhote = protCachorro.clonar();
		filhote.setIdade(1);
		filhote.setSexo("F");
		AnimalPrototype adulto = protCachorro.clonar();
		adulto.setIdade(5);
		adulto.setSexo("M");
		System.out.println(filhote.exibirInfo());
		System.out.println(adulto.exibirInfo());

		PaisPrototype protPais = new PaisPrototype(8510.000, "Brasil", "América do Sul");
		
		PaisPrototype clone = (PaisPrototype) protPais.clone();
		
		System.out.println("Original: " + protPais.exibirInfo());
		System.out.println("Clone: " + clone.exibirInfo());
		
	}

}
