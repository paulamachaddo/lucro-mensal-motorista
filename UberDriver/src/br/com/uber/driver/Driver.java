package br.com.uber.driver;

public class Driver {
	
	private String nome;
	private String carro;
	private double kmLitroCarro;
	
	public Driver (String nome, String carro) {
		this.nome = nome;
		this.carro = carro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCarro() {
		return carro;
	}
	
	public double getKmLitroCarro() {
		return kmLitroCarro;
	}
}
