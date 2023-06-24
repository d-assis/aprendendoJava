package sintaxebasica;

public class TestaWhile {
	
	public static void main(String[] args) {
		// o índice do laço deve ser declarado e inicializado fora do escopo do mesmo
		int index = 0;
		while(index <= 10) {
			System.out.println(index);
			
			index ++;
			//linha acima equivale a:
			// index = index + 1;
			// index += 1;
			// ++index;
		}
		
		System.out.println(index);
	}
}
