package class_car;

public class TestaClass {

	public static void main(String[] args) {
		Carro novoUno = new Carro("uno",2020,60000);
		System.out.println(novoUno.getPreco());
		System.out.println(novoUno.getAno());
		
		Carro palio = new Carro("palio",45000);
		System.out.println(palio.getPreco());
		System.out.println(palio.getAno());

	}

}
