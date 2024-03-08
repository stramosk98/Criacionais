package Singleton;

public class Conexao {
	
	private static Conexao instance;
	
	private String host;
	private String user;
	private String password;
	private int port;
	
	private Conexao() {
		
	}
	
	public static Conexao getInstance() {
		if (instance == null) {
			instance = new Conexao();
		}
		return instance;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conexao [host=");
		builder.append(host);
		builder.append(", user=");
		builder.append(user);
		builder.append(", password=");
		builder.append(password);
		builder.append(", port=");
		builder.append(port);
		builder.append("]");
		return builder.toString();
	}

}