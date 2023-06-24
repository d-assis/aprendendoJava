package sintaxebasica;

public class TestaDouble {
	public static void main(String[] args) {
		double salarioMinimo;
		salarioMinimo = 1212.50;
		System.out.println("o salário mínimo em 2022 está no valor de: " + salarioMinimo);
		
		double maioridade;
		maioridade = 18;
		
		double divisao = 3.14/2;
		System.out.println(divisao);
		
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5/2;
		System.out.println(novaTentativa);
		
		// para obter um resultado do tipo double numa operação aritimética, é preciso que pelo menos um dos números
		//seja escrito com casas decimais, assim como no exemplo abaixo.
		
		double agoraVai = 5.0/2;
		System.out.println(agoraVai);
		
		//não compila
		//int n1 = 12.5;
		
		//não compila
		//int n2 = 0.0;
		
		//compila
		double n3 = 125.50;
		
		//não compila
		//int n4 = n3;
	}
}
