package sintaxebasica;

public class TestaCaracteres {
	public static void main(String[] args) {
		//o tipo char pode guardar apenas uma letra que deve estar cercada por aspas simples, 
		//aspas duplas resultam em erro
		//exemplos:
		
		//não compila, aspas duplas
		//char l1 = "a";
		
		//não compila, mais de uma letra
		//char l2 = 'abc';
		
		//compila
		char letra = 'a';
		System.out.println(letra);
		
		//char também pode guardar valores numéricos
		//valores esses que são convertidos em caracteres de acordo com a tabela asc
		char n1 = 66;
		System.out.println(n1);
		
		//é possível somar valores numéricos armazenados numa variável char com valores int,
		//no entanto, ao armazenar o resultado dessa operação numa variável char, 
		//deve ser feito o casting do valor do resultado, convertendo-o para char
		n1 = (char) (n1 + 1);
		System.out.println(n1);
		
		//strings são declaradas a partir de String (c/ primeira letra maiúscula) 
		//e seu valor deve estar cercado por aspas duplas
		//ao contrário de char, strings podem ser vazias como no exemplo abaixo
		String vazia = "";
		
		//não compila
		//char vazio = '';
		
		String palavra = "a torre da andorinha";
		System.out.println(palavra);
		
		//ao "somar" valores numéricos a uma string, os mesmos são concatenados, 
		//sem haver a necessidade de conversão de tipos manual
		palavra = palavra + " é o livro " + 4;
		System.out.println(palavra);
		
		//vale destacar que String não faz parte dos tipos primitivos da linguagem Java
	}
}
