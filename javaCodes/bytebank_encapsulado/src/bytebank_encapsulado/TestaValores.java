package bytebank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		
		Conta accA = new Conta(1500,656184);
		System.out.println(accA.getAgencia());
		System.out.println(accA.getNumero());
		
		Conta accB = new Conta(1500,660122);
		
		Conta accC = new Conta(1500,665182);
		
		System.out.println(Conta.getTotal());
		
	}
}
