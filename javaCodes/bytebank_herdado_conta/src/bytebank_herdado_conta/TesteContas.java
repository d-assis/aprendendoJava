package bytebank_herdado_conta;

public class TesteContas {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(1500,654321);
		
		cc.deposita(1000);
		System.out.println("saldo da conta corrente: " + cc.getSaldo());
		
		Conta cp = new ContaPoupanca(1500,654321500);
		cp.deposita(2000);
		System.out.println("saldo da conta poupança: " + cp.getSaldo());
		
		cc.pix(30, cp);
		System.out.println("saldo da conta corrente: " + cc.getSaldo());
		System.out.println("saldo da conta poupança: " + cp.getSaldo());

	}

}
