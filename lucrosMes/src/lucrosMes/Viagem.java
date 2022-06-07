package lucrosMes;

public class Viagem {
	
	private int kmRodado;
	private double kmLitro;
	private float precoGasolina;
	private float precoCobrado;
	private double totalViagem;
	private double custoTrecho;
	private int numeroViagens;
	private double lucro;
	private String trecho;
	
	public Viagem (int kmRodado, double kmLitro, float precoGasolina, float precoCobrado, int numeroViagens, String trecho) {
		this.setKmRodado(kmRodado);
		this.setKmLitro(kmLitro);
		this.setPrecoGasolina(precoGasolina);
		this.setPrecoCobrado(precoCobrado);
		this.setNumeroViagens(numeroViagens);
		this.setTrecho(trecho);
	}
	
	public double custoViagem() {
		this.setTotalViagem((double) (this.getKmRodado()/this.getKmLitro())*this.getPrecoGasolina());
		return this.getTotalViagem();
	}
	
		
	public double custoTrecho () {
		this.setCustoTrecho((double) (this.getTotalViagem() * this.getNumeroViagens()));
		return this.getCustoTrecho();
	}
	
	public double lucroTrecho () {
		this.setLucro((int) ((int) (this.getPrecoCobrado() * this.getNumeroViagens()) - this.getCustoTrecho()));
		return lucro;
	}
		
	public String getTrecho() {
		return trecho;
	}

	public void setTrecho(String trecho) {
		this.trecho = trecho;
	}
	
	public int getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(int kmRodado) {
		this.kmRodado = kmRodado;
	}

	public double getKmLitro() {
		return kmLitro;
	}

	public void setKmLitro(double kmLitro) {
		this.kmLitro = kmLitro;
	}

	public float getPrecoGasolina() {
		return precoGasolina;
	}

	public void setPrecoGasolina(float precoGasolina) {
		this.precoGasolina = precoGasolina;
	}

	public float getPrecoCobrado() {
		return precoCobrado;
	}

	public void setPrecoCobrado(float precoCobrado) {
		this.precoCobrado = precoCobrado;
	}

	public double getTotalViagem() {
		return totalViagem;
	}

	public void setTotalViagem(double totalViagem) {
		this.totalViagem = totalViagem;
	}

	public double getCustoTrecho() {
		return custoTrecho;
	}

	public void setCustoTrecho(double custoTrecho) {
		this.custoTrecho = custoTrecho;
	}

	public int getNumeroViagens() {
		return numeroViagens;
	}

	public void setNumeroViagens(int numeroViagens) {
		this.numeroViagens = numeroViagens;
	}

	public int getLucro() {
		return (int) lucro;
	}

	public void setLucro(int lucro) {
		this.lucro = lucro;
	}

}
