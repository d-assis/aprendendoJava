package sintaxebasica;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 12;
		int pessoas = 2;
		
		//caso haja apenas uma instrução contida num bloco if, o uso de chaves é opcional na linguagem java
		if(idade >= 18) {
			System.out.println("Você maior de idade");
			System.out.println("Seja bem vindo");
		}else {
			if(pessoas >= 2) {
				System.out.println("Vc é menor mas está acompanhado, seja bem vindo");
			} else {
				System.out.println("Infelizmente você é menor de idade, volte quando tiver pelo menos 18 anos ou quando estiver acompanhado de um maior.");
			}
			
		}
				
	}
}
