package bytebank_herdado_conta;

public class SeguroDeVida implements Tributavel{
	
	public Cliente titular;
	private double credito;
	
	public double getCredito() {
		return this.credito;
	}
	
	public void setCredito(int idade) {
		this.credito = idade * 1500;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	@Override
	public double getValorImposto() {
		return 0.2 * credito;
	}
	
	
}
