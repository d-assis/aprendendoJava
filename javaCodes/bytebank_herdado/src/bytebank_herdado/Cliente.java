package bytebank_herdado;

// A classe Cliente abaixo interage com uma interface, implementando seus métodos.
//Para que isso ocorra, é preciso usar a palavra chave implements seguida pelo nome
//da interface implementada.
//E como requisito, a classe que implementa uma interface, deve criar a implementação 
//de todos os métodos obtidos através da interface.
// É possível uma classe implementar múltiplas interfaces
public class Cliente implements Autenticavel {

	private int senha;
	private String login;
	private AuthUtils util;
	
	public Cliente() {
		this.util = new AuthUtils();
	}
	
	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	@Override
	public void setLogin(String login) {
		this.util.setLogin(login);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}


}
