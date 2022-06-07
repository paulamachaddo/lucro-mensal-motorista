package br.com.uber.driver;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Mes {

	private String mesAtual;
	private Driver driver;
	private List<Viagem> viagens = new LinkedList<Viagem>();

	public Mes(String mesAtual, Driver driver) {
		this.mesAtual = mesAtual;
		this.driver = driver;
	}

	public String getMesAtual() {
		return mesAtual;
	}

	public Driver getDriver() {
		return driver;
	}

	public List<Viagem> getViagem() {
		return Collections.unmodifiableList(viagens);
	}

	public void adiciona(Viagem viagem) {
		this.viagens.add(viagem);
	}

	public int getLucroMensal() {
		int lucroTotal = 0;
		for (Viagem viagem : viagens) {
			lucroTotal += viagem.getLucroTotalTrecho();
		}
		return lucroTotal;
	}
}
