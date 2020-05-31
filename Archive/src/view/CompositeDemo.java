package view;
import model.Arquivos;
import model.Pastas;

public class CompositeDemo {

	public static void main(String[] args) {
		
		Arquivos aq = new Arquivos("Arquivo de texto", 254);
		Arquivos aq1 = new Arquivos("Arquivo de texto", 128);
		Arquivos aq2 = new Arquivos("Arquivos de texto", 4);
		
		Pastas p = new Pastas("Estudos");
		
		p.addArquivo(aq);
		p.addArquivo(aq1);
		p.addArquivo(aq2);
		
		Pastas p1 = new Pastas("Importante");
		
		Arquivos aq3 = new Arquivos("Arquivo de apresentação", 1000);
		Arquivos aq4 = new Arquivos("Arquivo de apresentação", 2000);
		p1.addArquivo(aq3);
		p1.addArquivo(aq4);
		p1.addArquivo(p);
		
		System.out.println("Exibindo todos os arquivos da pasta "+p.nome);
		p.listarArquivos();
		p.TamanhoArquivos();
		System.out.println();
		
		System.out.println("Exibindo todos os arquivos da pasta "+p1.nome);
		p1.listarArquivos();
		p1.TamanhoArquivos();
		System.out.println();
	}
	
}
