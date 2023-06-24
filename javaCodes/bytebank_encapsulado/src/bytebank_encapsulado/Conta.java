package bytebank_encapsulado;

public class Conta {
	private double saldo;
	private int agencia = 12;
	private int numero;
	private Cliente titular;
	//abaixo temos um atributo estático da classe Conta, total
	//ao declarar um atributo como estático, entendemos que o mesmo existe independente de qualquer instância da classe
	private static int total;
	
	//linha abaixo representa o método construtor da classe Conta
	// note que construtores não possuem declaração de retorno
	// note também que para invocar esse método é necessário o uso da palavra chave "new"
	// exemplo: Conta acc = new Conta();
	public Conta(int agc, int num) {
		System.out.println("criando nova conta!");
		//para fazer uso de atributos estáticos, navegamos pela classe Conta ao invés de uma instância da mesma
		//ex.: Conta acc = new Conta(); System.out.println(acc.total); //resultará em erro
		//o correto seria: Conta acc = new Conta(); System.out.println(Conta.total);
		Conta.total ++;
		System.out.println("o sistema possui um total de " + total + " contas abertas.");
		
		setAgencia(agc);
		setNumero(num);
		
		System.out.println("seguem as informações da conta criada");
		System.out.println("Agência: " + getAgencia());
		System.out.println("Número: " + getNumero());
	}
	
	void deposita(double valor) {
		if(valor > 0) {
		//linha abaixo poderia ser escrita assim:
		//saldo += valor
		this.saldo += valor;
		//a palavra reservada this indica auto referência ao objeto instanciado a partir dessa classe
		//e seu uso é opcional no caso acima
		}
	}
	
	public boolean saca(double valor){
		if(valor < 0 || valor > this.saldo) {
			System.out.println("valor indisponível para saque");
			return false;
		} else {
			this.saldo -= valor;
			System.out.println("sacou R$" + valor + " e o novo saldo é R$" + this.saldo);
			return true;
		}
	}
	
	public boolean pix(double valor, Conta destino) {
		if(valor > this.saldo) {
			//System.out.println("valor insdisponível");
			return false;
		} else {
			this.saldo -= valor;
			//destino.saldo += valor;
			destino.deposita(valor);
			//System.out.println("Transferiu R$" + valor + " para " + destino.titular);
			//System.out.println("Seu novo saldo é R$" + this.saldo);
			return true;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int num) {
		if (num <= 0) {
			System.out.println("Não é permitido o uso de números negativos, insira um número válido");
			//o uso da palavra reservada return é permitido num método void
			//no entanto, return não pode ser seguido por nenhuma informação já que o retorno é vazio
			//usamos o termo nesse caso para parar a execução do método mediante a condição determinada no if
			return;
		}
		this.numero = num;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		if (novaAgencia <= 0) {
			System.out.println("Não é permitido o uso de números negativos, insira um número válido");
			//o uso da palavra reservada return é permitido num método void
			//no entanto, return não pode ser seguido por nenhuma informação já que o retorno é vazio
			//usamos o termo nesse caso para parar a execução do método mediante a condição determinada no if
			return;
		}
		this.agencia = novaAgencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titu) {
		this.titular = titu;
	}
	
	//a mesma prática vista nos atributos vale nos métodos
	//abaixo, também precisamos da declaração static para determinar que esse método é independente de instância
	// e assume caráter global na classe Conta
	public static int getTotal() {
		//dentro do contexto de um método estático, não é possível acessar atributos de instância,
		// portanto o uso da palavra chave this resulta em erro quando usada nesse tipo de método
		//System.out.println(this.saldo);
		return Conta.total;
	}
}
