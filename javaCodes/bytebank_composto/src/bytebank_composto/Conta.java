package bytebank_composto;

public class Conta {
	private double saldo;
	int agencia = 12;
	int numero;
	Cliente titular;
	
	void deposita(double valor) {
		//linha abaixo poderia ser escrita assim:
		//saldo += valor
		this.saldo += valor;
		//a palavra reservada this indica auto referência ao objeto instanciado a partir dessa classe
		//e seu uso é opcional no caso acima
	}
	
	public boolean saca(double valor){
		if(valor > this.saldo) {
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
}
