package bytebank_herdado;

public class TestaReferencia {

	public static void main(String[] args) {
		//referência do tipo específico para tipo específico
		//compila e permite usar todos os métodos da classe base e da extensão
		Gerente g1 = new Gerente("lol","11122233344",5000);
		
		//referência de tipo genérico para específico
		
		//Funcionario g1 = new Gerente("lol","11122233344",5000);
		
		//referência de tipo específico para tipo genérico
		//não compila
		//Gerente g1 = new Funcionario("lol","11122233344",5000);
		//nem todo funcionário é gerente mas todo gerente é funcionário.
		
		g1.setNome("Jace Beleren");
		String nome = g1.getNome();
				
		System.out.println(nome);
		//g1.util.autentica(g1.getNome(),g1.getSenha());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		System.out.println(controle.getSoma());
		
		// Código abaixo deixou de funcionar devido a adição da palavra chave abstract
		//na classe Funcionário.
		// A palavra chave em questão indica que a classe é abstrata e não pode ser 
		//instanciada, ou em outras palavras, concretizada.
		// Tornar uma classe abstrata no entanto não impede a criação de classes 
		//filhas que herdem suas características, tornando essa técnica útil no contexto
		//de herança.
		
		//Funcionario f1 = new Funcionario("Lavinia","22233344455",2500);
		
		//System.out.println(f1.getNome());
		
		//controle.registra(f1);
		
		System.out.println(controle.getSoma());
		
		Terceirizado t1 = new Terceirizado("Niv","77788899900",2000);
		
		System.out.println(t1.getNome());
		
		controle.registra(t1);
		
		System.out.println(controle.getSoma());
	}

}
