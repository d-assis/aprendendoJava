package sintaxebasica;

public class TestaLacos2 {
	public static void main(String[] args) {
		for(int linha = 0; linha <= 10; linha++) {
			for(int coluna = 0; coluna <= 10; coluna++) {
				//é possível usar a palavra chave break para interromper a execução de um laço,
				//essa interrupção vale para o laço mais interno que contenha esse comando
				if(coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
