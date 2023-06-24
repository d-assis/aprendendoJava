package bytebank_herdado_conta;

public class TestaTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1500,666);
		cc.deposita(100);
		
		SeguroDeVida s = new SeguroDeVida();
		Cliente prosper = new Cliente("prosper", "66666666666", "Warlock", 666);
		s.setCredito(prosper.getIdade());
		
		CalculadorDeImposto clc =  new CalculadorDeImposto();
		
		clc.registra(s);
		System.out.println(clc.getTotalImposto());
		
		clc.registra(cc);
		System.out.println(clc.getTotalImposto());

	}

}
