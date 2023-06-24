package bytebank_composto;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDoTails = new Conta();
		
		//é possível instanciar objetos apartir das referências de uma classe para outra
		// abaixo observamos que o objeto da classe Cliente é instanciado a partir de sua referência no atributo titular
		contaDoTails.titular = new Cliente();
		
		System.out.println(contaDoTails.getSaldo());
		
		System.out.println(contaDoTails.titular);
		
		contaDoTails.titular.nome = "Tails";
		System.out.println(contaDoTails.titular.nome);

	}

}
