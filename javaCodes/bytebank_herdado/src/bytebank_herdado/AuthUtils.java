package bytebank_herdado;

public class AuthUtils {
	
	private int senha;
	
	private String login;
		
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	public void setLogin(String login) {
		this.login = login;
		
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

}
