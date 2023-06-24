package bytebank_herdado;

public class TesteTipos {

	public static void main(String[] args) {
		FuncionarioTipos f1 = new FuncionarioTipos("fulano","44455566677",2000);
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
		
		FuncionarioTipos f2 = new FuncionarioTipos("cicrano","11122233344",4000);
		f2.setTipo(1);
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());
		f2.getSenha();
		
		FuncionarioTipos f3 = new FuncionarioTipos("beltrano","99988877766",8000);
		f3.setTipo(2);
		System.out.println(f3.getTipo());
		System.out.println(f3.getBonificacao());
		f3.setSenha(1234);
		System.out.println(f3.getSenha());
		

	}

}
