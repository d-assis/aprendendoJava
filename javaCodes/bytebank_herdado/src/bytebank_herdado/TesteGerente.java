package bytebank_herdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Mani","55566677788",4000);
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		
		g1.setSenha(1234);
		boolean auth = g1.autentica(1234);
		System.out.println(auth);
		
		
	}

}
