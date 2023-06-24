package bytebank_herdado_conta;

public class ContaPoupanca extends Conta {
	// Ao criar uma classe que herda características, é possível notar que 
		//o construtor da classe mãe não é herdado automaticamente.
		// É necessário então, definir de forma explícita o construtor da classe chamando, 
		//dentro dele, o contrutor da classe mãe usando a palavra reservada "super"
		
		// Abaixo vemos o exemplo de definição do construtor da classe filha através de 
		//um dos construtores da mãe.
		public ContaPoupanca(int agc, int num) {
			super(agc,num);
		}
		
		//outro exemplo válido usando como base um construtor alternativo da mãe
		public ContaPoupanca() {
			super();
		}
		
		public void deposita(double valor)  {
			if(valor > 0) {
				super.saldo += valor;
				}
			}
}
