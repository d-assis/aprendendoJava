package class_car;

public class Carro {
	
	private String modelo;
	private int ano;
	private double preco;
	
	public Carro(String modelo, int ano , double preco) {
		setModelo(modelo);
		setAno(ano);
		setPreco(preco);
	}
	
	//Numa classe podemos ter mais de um construtor, o que pode oferecer mais flexibilidade no instanciamento de objetos
	//Mas para evitar códigos duplicados que dificultariam a manutenção, empregamos o uso do this() para "importar"
	//a lógica de um construtor em outro construtor
	public Carro(String modelo, double preco) {
		this(modelo,2023,preco);
	}
	
 	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		
		if(modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("modelo não foi informado. Modelo padrão (uno) será usado");
			this.modelo = "uno";
		}
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		if(ano >= 1891 && ano <= 2023) {
			this.ano = ano;
		} else {
			System.out.println("ano inválido, preencha novamente com um ano válido");
			this.ano = 2023;
		}
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("preço não pode ser menor que zero, preço base de 40000 será utilizado");
		}
	}
	
	
}
