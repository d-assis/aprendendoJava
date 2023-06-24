package bytebank_herdado;

public class ControleBonificacao {
	private double soma;
	
	// Mesmo usando o tipo base da arvore de classes de funcionário,
	//ao o programa respeita os métodos específicos do objeto passado como 
	//parâmetro.
	// Por exemplo: ao chamar o método registra, passando como parâmetro um 
	//objeto do tipo Gerente, serão respeitadas as particularidades do objeto
	//enquanto classe derivada. A regra de bonificação específica para gerentes será 
	//aplicada ao usar esse método, mesmo que o tipo do parâmetro seja o da classe
	//mãe ou classe base. 
	// Portanto, não é necessária a declaração de um método registra()
	//para cada nova classe criada a partir de funcionário. 
	// A vantagem do polimorfismo reside em construir estruturas que referenciam
	//apenas a base da árvore de classes, mas que respeitam a especificidade de todas
	//as classes derivadas dessa base.
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return this.soma;
	}
}
