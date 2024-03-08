package FactoryMethod;

public class FabricaPostegreSQLConexao extends FabricaConexao {

	@Override
	public IDataBase criarConexao() {
		return new PostgreSQLConexao();
	}

}
