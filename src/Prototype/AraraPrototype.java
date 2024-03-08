package Prototype;

public class AraraPrototype extends AnimalPrototype {

	protected AraraPrototype ( AraraPrototype araraPrototype ) {
		this.idade = araraPrototype.getIdade();
		this.sexo = araraPrototype.getSexo();
	}
		
	public AraraPrototype () {
		idade = 0;
	}
		
	@Override
	public String exibirInfo () {
		return "Idade: " + getIdade() + " Sexo: " + getSexo();
	}
		
		@Override
	public AnimalPrototype clonar() {
		return new AraraPrototype(this);
	}
			
}