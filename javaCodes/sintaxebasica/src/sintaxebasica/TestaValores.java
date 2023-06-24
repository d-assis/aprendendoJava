package sintaxebasica;

public class TestaValores {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 7;
		n2 = n1;
		n1 = 10;
		
		//qual o valor de n2?
		System.out.println(n2);
		
		//note que ao atribuir o valor de n1 a n2, a atribuição se resume ao valor da variável naquele momento
		//não se trata de referência permanente
	}
}
