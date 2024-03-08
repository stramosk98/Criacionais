package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexao conexao1 = Conexao.getInstance();
		
		conexao1.setHost("host.com");
		conexao1.setUser("root");
		conexao1.setPassword("3213");
		conexao1.setPort(123);
		
		Conexao conexao2 = Conexao.getInstance();
		System.out.println(conexao2);
	
		
	}

}
