package sintaxebasica;

public class TestaSomatoria {

	public static void main(String[] args) {
		int index = 0;
		int total = 0;
		
		while(index <= 10) {		
			
			total += index;
			
			index++;
		}
		
		System.out.println(total);

	}

}
