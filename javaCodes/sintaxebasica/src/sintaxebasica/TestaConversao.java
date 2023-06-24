package sintaxebasica;

public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1212.50;
		System.out.println(salario);
		// não compila
		// int valor = salario
		
		//abaixo podemos observar um exemplo de "casting", ou conversão de tipos
		int valor = (int) salario;
		System.out.println(valor);
		
		//variáveis do tipo int só podem guardar números menores ou iguais a 2bi
		//ultrapassado esse limite, deve-se usar o tipo long
		
		//linha abaixo não compila, apontando como erro "type int is out of range"
		//int numerao = 20000000012;
		
		//linha abaixo compila, porém é necessária a adição da letra L em caixa alta 
		//para que o valor seja computado como long
		long numeralho = 20000000012L;	
		System.out.println(numeralho);
		
		//tipos com limites de valor menores, vistos em situações muito específicas
		short valorPequeno = 2131;
		byte valorMicro = 127;
		
		double n1 = 0.2;
		double n2 = 0.1;
		//resultado bizarrésimo
		double total = n1 + n2;
		System.out.println(total);
		
		// não compila, o valor 3.14 é considerado 64bits, e o tipo float comporta 32
		//float n3 = 3.14;
		
		//para que a declaração funcione, é necessário executar uma conversão
		//dessa forma
		float n3 = (float)3.14;
		System.out.println(n3);
		
		//ou dessa aqui
		float n4 = 3.14f;
		System.out.println(n4);
	}
}
