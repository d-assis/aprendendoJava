package bytebank_composto;

public class TestaSaqueNegativo {

	public static void main(String[] args) {
		Conta nConta = new Conta();
		nConta.deposita(1000);
		System.out.println(nConta.saca(1500));
		System.out.println(nConta.getSaldo());
		
		//na classe conta, o atributo saldo foi declarado como privado
		//significando que apenas a própria classe tem acesso direto a ele
		//para ler e modificar um atributo privado, é necessário fazer uso de métodos acessores
		//no caso desse programa, utilizamos getSaldo() nas linhas 9 e 16
		//nConta.saldo -= 2000; a operação ao lado não compila justamente por tentar acessar o atributo diretamente
		System.out.println(nConta.getSaldo());

	}

}
