package sintaxebasica;

public class TestaLacos {
	public static void main(String[] args) {
		for(int indexA = 0; indexA <= 10; indexA++) {
			for(int indexB = 0; indexB <= 10; indexB++) {
				System.out.print(indexA * indexB + " ");
			}
			
			System.out.println("");
		}
	}
}
