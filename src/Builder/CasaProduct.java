package Builder;

public class CasaProduct {

	private float tijolo;
	private float cimento;
	private float areia;
	private float pedra;

	public float getTijolo() {
		return tijolo;
	}
	public void setTijolo(float tijolo) {
		this.tijolo = tijolo;
	}
	public float getCimento() {
		return cimento;
	}
	public void setCimento(float cimento) {
		this.cimento = cimento;
	}
	public float getAreia() {
		return areia;
	}
	public void setAreia(float areia) {
		this.areia = areia;
	}
	public float getPedra() {
		return pedra;
	}
	public void setPedra(float pedra) {
		this.pedra = pedra;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CasaProduct [tijolo=");
		builder.append(tijolo);
		builder.append(", cimento=");
		builder.append(cimento);
		builder.append(", areia=");
		builder.append(areia);
		builder.append(", pedra=");
		builder.append(pedra);
		builder.append("]");
		return builder.toString();
	}
	
}