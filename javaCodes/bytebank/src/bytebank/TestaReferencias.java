package bytebank;

public class TestaReferencias {

	public static void main(String[] args) {
		Conta nossaConta = new Conta();
		nossaConta.saldo = 300;
		
		System.out.println("saldo da nossa conta: " + nossaConta.saldo);
		
		Conta outraConta = nossaConta;
		
		System.out.println("saldo da outra conta: " + outraConta.saldo);
		
		outraConta.saldo += 100;
		System.out.println("saldo da nossa conta: " + nossaConta.saldo);
		
		if(nossaConta == outraConta) {
			System.out.println("ambas as váriáveis contém referências direcionadas a um mesmo objeto Conta.");
			System.out.println("ao alterar alguma informação do objeto através dessa referência,");
			System.out.println("ela será refletida para todas as outras.");
		}
		
		System.out.println(nossaConta);
		System.out.println(outraConta);

	}

}
