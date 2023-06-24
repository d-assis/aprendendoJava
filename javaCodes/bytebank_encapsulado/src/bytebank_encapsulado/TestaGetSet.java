package bytebank_encapsulado;

public class TestaGetSet {
	public static void main(String[] args) {
		Conta nConta = new Conta(1500,655855);
		
		nConta.setNumero(1337);
		System.out.println(nConta.getNumero());
		
		Cliente lunam = new Cliente();
		lunam.setNome("Lunam Lapin");
		nConta.setTitular(lunam);
		
		System.out.println(nConta.getTitular().getNome());
		
		nConta.getTitular().setProfissao("Healer");
		System.out.println(lunam.getProfissao());
		
		// as linhas abaixo comprovam a relação de referência entre os objetos das classes Conta e Cliente
		// importante destacar também que só há um cliente e uma conta nesse código,
		// pois as classes aos quais pertencem só foram instanciadas uma vez 
		Cliente titularDaConta = nConta.getTitular();
		System.out.println(lunam == titularDaConta);
	}
}
