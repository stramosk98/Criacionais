package FactoryMethod;

public class FabricaMySQLConexao extends FabricaConexao {

	@Override
	public IDataBase criarConexao() {
		return new MySQLConexao();
	}

}
