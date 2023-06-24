package bytebank_herdado;

public class SistemaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel fAuth) {
		boolean auth = fAuth.autentica(this.senha);
		if(auth) {
			System.out.println("Seja bem-vindo ");
		} else {
			System.out.println(" sua senha está incorreta, tente novamente");
		}
	}
}
