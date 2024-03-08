package FactoryMethod;

public class MySQLConexao implements IDataBase {

	@Override
	public void conectar() {
		System.out.println("Conectando ao MySQL...");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando do MySQL...");
	}
	
}
