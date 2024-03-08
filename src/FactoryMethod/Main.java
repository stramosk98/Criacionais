package FactoryMethod;

public class Main {

	public static void main(String[] args) {
		
		FabricaConexao mysqlFactory = new FabricaMySQLConexao();
        IDataBase mysqlConnection = mysqlFactory.criarConexao();
        mysqlConnection.conectar();
        mysqlConnection.desconectar();

        FabricaConexao postgresqlFactory = new FabricaPostegreSQLConexao();
        IDataBase postgresqlConnection = postgresqlFactory.criarConexao();
        postgresqlConnection.conectar();
        postgresqlConnection.desconectar();
	}

}
