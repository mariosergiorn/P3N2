package model;

public class TamanhoFamilia extends AbstracaoTamanho{

	public TamanhoFamilia(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);

	}

	public void beber() {
		System.out.println("Toma um gole de " + refrigerante);

		System.out.println("Toma um gole de " + refrigerante);
		
		System.out.println("Toma mais um gole de " + refrigerante);
		
		System.out.println("Toma vários goles de " + refrigerante);
		
		System.out.println("Acabou o(a) " + refrigerante);
		
		System.out.println();
		
	}
	
	

}
