package sintaxebasica;

public class TestandoFatorial {

	public static void main(String[] args) {
		//Aqui dispusemos 2 laços aninhados para a resolução do problema
		//no laço externo, o contador i fornece um "limitador" de iterações que ocorrerão com a variável f
		for(int i = 1; i <= 10; i++) {
			//a variável f deve ser declarada/inicializada fora do laço das multiplicações,
			//para que dessa forma consiga acumular o resultado das várias operações fora do escopo do laço interno
			int f = 1;
			for(int j = i; j >= 1; j--) {
				f = j * f;
			}
			//ao final das iterações do laço interno, o valor acumulado de f é exibido no console
			System.out.println("o fatorial de: "+ i + " é igual a : " + f);
			// ao iniciar a próxima iteração do laço externo, f volta a ser 1
			//as multiplicações cumulativas acontecem novamente, mas com um limite maior
		}

	}

}
