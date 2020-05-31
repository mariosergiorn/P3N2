package view;

import model.AbstracaoTamanho;
import model.CocaCola;
import model.Fanta;
import model.Guarana;
import model.ImplementacaoRefrigerante;
import model.Sprite;
import model.TamanhoFamilia;
import model.TamanhoMedio;
import model.TamanhoPequeno;

public class Teste {
	
	public static void main(String[] args) {
		
		ImplementacaoRefrigerante CocaCola = new CocaCola();
		ImplementacaoRefrigerante Guarana = new Guarana();
		ImplementacaoRefrigerante Fanta = new Fanta();
		ImplementacaoRefrigerante Sprite = new Sprite();
		
		AbstracaoTamanho tamanhoP = new TamanhoPequeno(CocaCola);
		AbstracaoTamanho tamanhoP2= new TamanhoPequeno(Sprite);
		AbstracaoTamanho tamanhoM = new TamanhoMedio(Guarana);
		AbstracaoTamanho tamanhoF = new TamanhoFamilia(Fanta);
		
		tamanhoP.beber();
		tamanhoP2.beber();
		tamanhoM.beber();
		tamanhoF.beber();
		
		
		
	}

}
