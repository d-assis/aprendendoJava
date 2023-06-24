package bytebank_herdado;

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	

	public Funcionario(String nm, String cpf, double sal) {
		System.out.println("registrando novo funcionario");
		
		this.setNome(nm);
		this.setCpf(cpf);
		this.setSalario(sal);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Métodos abstratos não podem possuir implementação em sua classe original, apenas
	//em classes filhas não abstratas.
	// A assinatura de métodos abstratos é definida em sua classe de origem.
	// Métodos abstratos só podem existir em classes abstratas.
	public abstract double getBonificacao();
	


}
