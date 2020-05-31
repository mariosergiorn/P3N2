package model;

import java.util.ArrayList;

public class Pastas implements Explorador{
	
	public String nome;
	
	public float tamanhoPasta;
	
	public Pastas(String nome) {
		super();
		this.nome = nome;
	}

	public float getTamanhoKB() {
		return tamanhoPasta;
	}

	public void setTamanhoPasta(float tamanhoPasta) {
		this.tamanhoPasta = tamanhoPasta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	ArrayList<Explorador> arquivos = new ArrayList<Explorador>();
	
	public void addArquivo(Explorador ex) {
		arquivos.add(ex);
	}
	
	public void listarArquivos() {
		for(Explorador a : arquivos) {
			System.out.println("Nome: "+a.getNome());
		}
	}
	
	public void removerArquivo(int index) {
		this.arquivos.remove(index);

	}
	
	public void TamanhoArquivos() {
		for(Explorador a : arquivos) {
			tamanhoPasta += a.getTamanhoKB();
		}
		System.out.println("O tamanho da pasta é "+tamanhoPasta+" KB");
	}

	
	
}
