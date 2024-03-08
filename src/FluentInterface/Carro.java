package FluentInterface;

public class Carro {
	
	private String marca;
    private String cor;
    private String modelo;
    private int ano;

    public Carro marca(String marca) {
        this.marca = marca;
        return this;
    }

    public Carro cor(String cor) {
        this.cor = cor;
        return this;
    }

    public Carro modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Carro ano(int ano) {
    	this.ano = ano;
        return this;
    }

    public void exibirCarro() {
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);
    }
    
}
