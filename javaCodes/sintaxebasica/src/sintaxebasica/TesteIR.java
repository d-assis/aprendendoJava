package sintaxebasica;

public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 4000.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Sua aliquota é de 7.5% e você pode deduzir o valor de R$142");
		}else if(salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("Sua aliquota é de 15% e você pode deduzir o valor de R$350");
		}else if(salario >= 3751.1 && salario <= 4664.0) {
			System.out.println("Sua aliquota é de 22.5% e você pode deduzir o valor de R$636");
		}

	}

}
