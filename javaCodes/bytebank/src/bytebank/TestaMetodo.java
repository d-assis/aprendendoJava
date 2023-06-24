package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta novaConta = new Conta();
		
		novaConta.deposita(100.55);
		
		System.out.println(novaConta.saldo);
		
		boolean sucesso = novaConta.saca(200);
		
		System.out.println(sucesso);
		
		Conta x = new Conta();
		
		x.deposita(1000);
		
		novaConta.titular = "Neo";
		
		x.pix(500, novaConta);
		
		System.out.println(novaConta.saldo);
		
		boolean sucessoPix = novaConta.pix(500, x);
		
		if(sucessoPix) {
			System.out.println("transferencia concluída com sucesso");
		} else {
			System.out.println("houve um problema com a transferência");
		}
				

	}

}
