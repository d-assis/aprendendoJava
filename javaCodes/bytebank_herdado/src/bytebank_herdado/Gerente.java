package bytebank_herdado;

// Em java, para indicarmos uma relação de herança entre classes,
//usamos a palavra reservada "extends" entre a classe que herda e a classe
//que é herdada.
// No caso abaixo, Gerente herda todas os atributos e métodos de Funcionario,
//e desse modo podemos manter na classe Gerente só aquilo que é específico para ela
public class Gerente extends Funcionario implements Autenticavel{

	//private String nome;
	//private String cpf;
	//private double salario;
	//private int senha;
	//private String login;
	private AuthUtils util;
	
	// É preciso definir um novo construtor explícito para a classe Gerente,
	//para isso, utilizamos a sintaxe padrão para esse tipo de método
	// visibilidade NomeDaClasse(tipoDoParametro parametro){}
	// A diferença está no miolo do método, que deve importar o conteúdo do construtor
	//da classe mãe através da palavra-chave "super" seguida dos parâmetros,
	//entre parenteses, definidos no contrutor da classe mãe
	public Gerente(String nm, String cpf, double sal) {
		super(nm, cpf, sal);
		//this.setLogin(nm);
		//this.setSenha(1234);
		this.util = new AuthUtils();
	}
	
	
	// O método abaixo nos dá um exemplo de reescrita, 
	//pois apresenta a mesma assinatura de um método da classe mãe,
	//porém com diferença no bloco de código.
	//mesma assinatura == mesmo nome, parâmetros, visibilidade e retorno
	
	//public double getBonificacao() {
		// A linha abaixo funciona mas é menos expressiva do que a próxima,
		//que indica corretamente a procedência do atributo salário,
		//que por sua vez pertence a classe mãe ou super classe
		//double boni = this.salario;
		
		// Usando a palavra chave "super" indicamos de forma melhor a procedência
		//de atributos e métodos
		// Na linha abaixo é possível notar mais uma vez a repetição de código
		//já implementado, tornando o programa menos manutenível,
		//já que repetir "super.salario * 0.1" implica na necessidade de 
		//atualizar dois arquivos ao invés de um em caso de alteração da regra
		//de negócio
		//double boni = (super.salario * 0.1) + super.salario;
		
		// A melhor solução para fazer referência a regra de bonificação de funcionário
		//seria referenciar o método da classe mãe diretamente, como vemos abaixo:
		
		//double boni = super.getBonificacao() + super.getSalario();
		
		//System.out.println("chamando método proveniente da classe gerente");
		//return 	boni;
	//}
		// método acima deixou de funcionar pois getBonificacao() da classe mãe 
		//passou a ser um método abstrato e portanto não pode ser invocado diretamente
		//da classe mãe pois a mesma não contém a sua implementação.
		// nesse caso, as classes filhas devem implementar o método a sua maneira
		// como será feito abaixo:
		
		public double getBonificacao() {
			System.out.println("chamando método proveniente da classe gerente");
			double boni = this.getSalario();
			return boni;
		}
	
	
	// Abaixo temos um exemplo do conceito de sobrecarga.
	// Essa técnica permite que criemos mais de um método com o mesmo nome,
	//porém contendo parâmetros diferentes, o que denota assinaturas 
	//distintas para esses métodos
//	public boolean autentica(String login, int senha) {
//		if(this.senha == senha && this.login == login) {
//			return true;
//		}else {
//			return false;
//		}
//	}


		@Override
		public void setSenha(int senha) {
			this.util.setSenha(senha);
			
		}

		@Override
		public void setLogin(String login) {
			this.util.setLogin(login);
			
		}

		@Override
		public boolean autentica(int senha) {
			return this.util.autentica(senha);
		}


//	public int getSenha() {
//		return this.senha;
//	}
	

}
