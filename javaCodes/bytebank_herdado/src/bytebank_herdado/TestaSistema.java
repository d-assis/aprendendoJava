package bytebank_herdado;

public class TestaSistema {

	public static void main(String[] args) {
	 
		Gerente g = new Gerente("Prosper", "66666666666", 6666.66);
		g.setSenha(2222);
		
		Administrador adm = new Administrador("Sefris", "111111111111", 1111.11);
		adm.setSenha(2222);
		
		Cliente c = new Cliente();
		c.setSenha(2222);
		
		SistemaInterno sys = new SistemaInterno();
		
		sys.autentica(g);
		sys.autentica(adm);
		sys.autentica(c);

	}

}
