package bytebank_herdado;

public class Terceirizado extends Funcionario{
	public Terceirizado(String nm, String cpf, double sal) {
		super(nm,cpf,sal);
	}
	
	//as classes filhas de "Funcionario" devem implementar o método getBonificacao()	
	// a sua maneira como será feito abaixo:
	
	public double getBonificacao() {
		System.out.println("chamando método proveniente da classe terceirizado");
		double boni = 200;
		return boni;
	}
}
