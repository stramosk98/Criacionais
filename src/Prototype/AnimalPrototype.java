package Prototype;

public abstract class AnimalPrototype {
	
	  protected int idade;
	  protected String sexo;
	  public abstract String exibirInfo();
	  public abstract AnimalPrototype clonar();
	  
	  public int getIdade() {
		  return idade;
	  }
	  
	  public void setIdade(int idade) {
		  this.idade = idade;
	  }
	  
	  public String getSexo() {
		  return sexo;
	  }
	  
	  public void setSexo(String sexo) {
		  this.sexo = sexo;
	  }
}