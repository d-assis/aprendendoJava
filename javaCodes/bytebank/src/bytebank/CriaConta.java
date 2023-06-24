package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		//Ao inserir um objeto numa variável, 
		//a mesma deve ser declarada com o tipo igual ao da classe ao qual o objeto pertence
		// no exemplo abaixo temos um objeto da classe Conta inserido numa variável do tipo Conta
		Conta minhaConta = new Conta();
		
		minhaConta.saldo = 1000000;
		System.out.println(minhaConta.saldo);
		
		minhaConta.saldo -= 500000;
		System.out.println(minhaConta.saldo);
		
		Conta suaConta = new Conta();
		suaConta.saldo = 1000;
		
		System.out.println("minha conta tem " + minhaConta.saldo + "R$");
		System.out.println("sua conta tem " + suaConta.saldo + "R$");
		
		//ao instanciar objetos, caso os valores de atributo não tenham sido especificados
		//a linguagem atribui valores padrão aos mesmos
		// para o caso de booleanos o valor padrão é false
		// para números é 0
		//para String temos ...
		System.out.println(minhaConta.agencia);
		System.out.println(minhaConta.numero);
		
		suaConta.agencia = 142;
		System.out.println(suaConta.agencia);
		
		if(minhaConta == suaConta) {
			System.out.println("ambas as váriáveis são referências direcionadas a um mesmo objeto Conta.");
			System.out.println("ao alterar alguma informação do objeto através dessa referência,");
			System.out.println("ela será refletida para todas as outras.");
		}else {
			System.out.println("referência a contas diferentes");
		}

	}

}
