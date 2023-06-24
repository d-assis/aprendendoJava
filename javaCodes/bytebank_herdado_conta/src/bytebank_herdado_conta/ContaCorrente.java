package bytebank_herdado_conta;

public class ContaCorrente extends Conta implements Tributavel {
	
	// Ao criar uma classe que herda características, é possível notar que 
	//o construtor da classe mãe não é herdado automaticamente.
	// É necessário então, definir de forma explícita o construtor da classe chamando, 
	//dentro dele, o construtor da classe mãe usando a palavra reservada "super"
	
	// Abaixo vemos o exemplo de definição do construtor da classe filha através de 
	//um dos construtores da mãe.
	public ContaCorrente(int agc, int num) {
		super(agc,num);
	}
	
	//outro exemplo válido usando como base um construtor alternativo da mãe
	public ContaCorrente() {
		super();
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSaque = valor + 0.2;
		return super.saca(valorSaque);
	}
	
	public void deposita(double valor)  {
		if(valor > 0) {
			super.saldo += valor;
			}
		}
	
	@Override
	public double getValorImposto() {
		return 0.1 * super.saldo;
	}

}
