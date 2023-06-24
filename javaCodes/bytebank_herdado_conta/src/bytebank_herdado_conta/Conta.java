package bytebank_herdado_conta;

public abstract class Conta {
	protected double saldo;
	private int agencia = 12;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta() {}
	
	public Conta(int agc, int num) {
		System.out.println("criando nova conta!");
		Conta.total ++;
		System.out.println("o sistema possui um total de " + total + " contas abertas.");
		
		setAgencia(agc);
		setNumero(num);
		
		System.out.println("seguem as informações da conta criada");
		System.out.println("Agência: " + getAgencia());
		System.out.println("Número: " + getNumero());
	}
	
	public abstract void deposita(double valor);
	
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
			return false;
		} else {
			this.saldo -= valor;
			destino.deposita(valor);
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
	
	public static int getTotal() {
		return Conta.total;
	}
}
