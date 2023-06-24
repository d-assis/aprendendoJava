package bytebank_herdado_conta;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	private int idade;
	
	public Cliente(String nm, String cpf, String profissao, int idade) {
		this.setCpf(cpf);
		this.setNome(profissao);
		this.setProfissao(profissao);
		this.setIdade(idade);
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
