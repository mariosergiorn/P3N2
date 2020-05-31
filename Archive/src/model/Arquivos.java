package model;

public class Arquivos implements Explorador{
	
	public String nome;
	public float tamanhoKB;
	
	public Arquivos(String nome, float tamanhoKB) {
		super();
		this.nome = nome;
		this.tamanhoKB = tamanhoKB;
	}
	
	public Arquivos(){}

	public float getTamanhoKB() {
		return tamanhoKB;
	}

	public void setTamanhoKB(float tamanhoKB) {
		this.tamanhoKB = tamanhoKB;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
