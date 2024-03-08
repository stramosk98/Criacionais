package Prototype;

public class CachorroPrototype extends AnimalPrototype {

	protected CachorroPrototype ( CachorroPrototype cachorroPrototype ) {
		this.idade = cachorroPrototype.getIdade();
		this.sexo = cachorroPrototype.getSexo();
	}
		
	public CachorroPrototype () {
		idade = 0;
	}
		
	@Override
	public String exibirInfo () {
		return "Idade: " + getIdade() + " Sexo: " + getSexo();
	}
		
		@Override
	public AnimalPrototype clonar() {
		return new CachorroPrototype(this);
	}
			
}