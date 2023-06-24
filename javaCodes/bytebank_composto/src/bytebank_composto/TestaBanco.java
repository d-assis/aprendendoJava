package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente sonic = new Cliente();
		
		sonic.nome = "Sonic";
		sonic.cpf = "123.123.456-00";
		sonic.profissao = "ouriço rápido";
		
		Conta contaDoSonic = new Conta();
		contaDoSonic.deposita(2000);
		
		contaDoSonic.titular = sonic;
		System.out.println(contaDoSonic.titular.nome);
		System.out.println(contaDoSonic.titular);
	}
}
