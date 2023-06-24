package bytebank_herdado;

public class FuncionarioTipos {
	private String nome;
	private String cpf;
	private double salario;
	// o atributo tipo indica o tipo de funcionário
	//0 - funcionário comum
	//1 - gerente
	//2 - diretor
	private int tipo = 0;
	// o atributo senha é um exemplo de regra exclusiva para um tipo de funcionário
	private int senha;
	
	
	// nessa configuração, getter e setter do atributo senha 
	//e quaisquer outros específicos para um tipo
	//tem de ser "chaveados" por meio de condicionais, uma má prática
	public int getSenha() {
		if(this.tipo == 2) {
			return senha;
		} else {
			System.out.println("tipo de funcionário não possui senha");
			return 0;
		}
		
	}

	public void setSenha(int s) {
		if(this.tipo == 2) {
			this.senha = s;
		} else {
			System.out.println("tipo de funcionário não possui senha");
		}
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public FuncionarioTipos(String nm, String cpf, double sal) {
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
	
	// o método abaixo faz uso do atributo tipo para definir informações sobre o objeto
	// estruturar uma classe dessa forma pode causar uma série de problemas,
	//os chamados "code smells"
	// nesse caso por exemplo, para cada novo tipo, seríamos obrigados a voltar para
	//essa classe e adicionar novas condicionais
	// caso algum dos novos tipos tenha alguma regra única, também teríamos que 
	//implementá-la misturando com todas as outras, sendo que a única separação 
	//seria feita através de novas condicionais, um problema crescente.
	// para evitar esse tipo de má prática se usa a herança, uma forma de reaproveitar
	//código de maneira apartada, tornando o código mais seguro e manutenível.
	public double getBonificacao() {
		double boni = 0;
		if(this.tipo == 0) {
			boni = this.salario * 0.1;
		} else if(this.tipo == 1) {
			boni = this.salario;
		} else {
			boni = this.salario + salario * 0.2;
		}
		return 	boni;
	}
}
