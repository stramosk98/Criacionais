package FactoryMethod;

public class PostgreSQLConexao implements IDataBase {

	@Override
	public void conectar() {
		System.out.println("Conectando ao Postgre...");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando do Postgre...");
	}
	
}
