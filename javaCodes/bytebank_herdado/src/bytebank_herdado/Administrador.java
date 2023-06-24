package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel{
	
	//private int senha;
	//private String login;
	private AuthUtils util;

		public Administrador(String nm, String cpf, double sal) {
			super(nm,cpf,sal);
			//this.setLogin(cpf);
			//this.setSenha(1234);
			this.util = new AuthUtils();
		}
		
		public double getBonificacao() {
			System.out.println("chamando método proveniente da classe Administrador");
			double boni = 50;
			return boni;
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
