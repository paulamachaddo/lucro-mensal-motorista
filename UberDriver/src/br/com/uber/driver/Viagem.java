package br.com.uber.driver;

public class Viagem {
	
	private String destino;
	private int kmDistancia;
	private int valorCobrado;
	private double valorGasolina;
	private double kmLitroCarro;
	private int totalDeViagens;
	
	public Viagem (String destino, int totalDeViagens, int kmDistancia, int valorCobrado, double valorGasolina, double kmLitroCarro) {
		this.destino = destino;
		this.totalDeViagens = totalDeViagens;
		this.kmDistancia = kmDistancia;
		this.valorCobrado = valorCobrado;
		this.valorGasolina = valorGasolina;
		this.kmLitroCarro = kmLitroCarro;
	}
		
	public String getDestino() {
		return destino;
	}
	
	public int getKmDistancia() {
		return kmDistancia;
	}

	public int getValorCobrado() {
		return valorCobrado;
	}

	public double getValorGasolina() {
		return valorGasolina;
	}
	
	public double getKmLitroCarro() {
		return kmLitroCarro;
	}
	
	public int getTotalDeViagens() {
		return totalDeViagens;
	}
	
	public double litroGasto() {
		double litroGasto = (int) (this.getKmDistancia()/this.kmLitroCarro);
		return litroGasto;
	}
	
	public double getLucroTrecho() {
		int lucroTrecho = (int) (this.getValorCobrado() - (this.litroGasto() * this.getValorGasolina()));	
		return lucroTrecho;
	}
	
	public double getLucroTotalTrecho() {
		int lucroTotal = (int) (this.getLucroTrecho() * this.getTotalDeViagens());
		return lucroTotal;
	}
	
	@Override
	public String toString() {
		return "[Destino: " + this.getDestino() + " a " + this.getKmDistancia() + " km de distância de Balneário Camboriú.]";
	}
}
