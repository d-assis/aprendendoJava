package sintaxebasica;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 12;
		int pessoas = 1;
		boolean acompanhado = pessoas >= 2;
		
		boolean inicializado;
		// linha abaixo não compila pois ao declarar a variável, ela não possui valor atrelado
		// é preciso declarar e atribuir um valor à mesma antes de usá-la em procedimentos
		// importante notar que caso haja qualquer possibilidade de uso de uma variável não inicializada, 
		// o programa apresentará erro na compilação
		//System.out.println(inicializado);
		
		System.out.println("o valor de acompanhado é igual a " + acompanhado);
		
		//ao testar um valor booleano numa condicional, é possível suprimir a comparação valor == true
		// al que seria escrito assim, if(idade >= 18 || acompanhado == true), pode ser escrito como a linha abaixo
		if(idade >= 18 || acompanhado) {
			System.out.println("Você maior de idade ou está acompanhado de um maior");
			System.out.println("Seja bem vindo");
		}else {
				System.out.println("Infelizmente você é menor de idade, volte quando tiver pelo menos 18 anos ou quando estiver acompanhado de um maior.");
			
		}
				
	}
}
