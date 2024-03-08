package FluentInterface;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
	    private String empresa;
	    private String cliente;
	    private List<String> itens = new ArrayList<>();
	    private double total;

	    public NotaFiscal empresa(String empresa) {
	        this.empresa = empresa;
	        return this;
	    }

	    public NotaFiscal cliente(String cliente) {
	        this.cliente = cliente;
	        return this;
	    }

	    public NotaFiscal item(String item) {
	        this.itens.add(item);
	        return this;
	    }

	    private double calcularTotal() {
	        return itens.size() * 30;
	    }

	    public void emitir() {
	        this.total = calcularTotal();
	        System.out.println("Empresa: " + empresa);
	        System.out.println("Cliente: " + cliente);
	        System.out.println("Itens:");
	        for (String item : itens) {
	            System.out.println("- " + item);
	        }
	        System.out.println("Total: " + total);
	    }

}
