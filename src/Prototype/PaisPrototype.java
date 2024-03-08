package Prototype;

public class PaisPrototype implements IPais {
	
    protected double territorio;
    protected String nome;
    protected String continente;
    

    public PaisPrototype(double territorio, String nome, String continente) {
        this.territorio = territorio;
        this.nome = nome;
        this.continente = continente;
    }

    public double getTerritorio() {
        return territorio;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public String getContinente() {
    	return continente;
    }
    
    @Override
	public String exibirInfo () {
		return "Território: " + getTerritorio() + " Nome: " + getNome() + " Continente: " + getContinente();
	}

    @Override
    public IPais clone() {
        // Clonagem superficial
        return new PaisPrototype(this.territorio, this.nome, this.continente);
    }
}
