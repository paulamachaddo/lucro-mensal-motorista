package br.com.uber.driver;

public class Janeiro {
	
	public static void main(String[] args) {
		
		Driver paulo = new Driver("Paulo", "Versa");
		Mes janeiro = new Mes("janeiro", paulo);
		
		Viagem v1 = new Viagem ("Floripa", 10, 100, 180, 7.19, 14);
		Viagem v2 = new Viagem("Navegantes", 18, 30, 100, 7.19, 14);
		Viagem v3 = new Viagem("Camboriu", 50, 15, 30, 7.19, 14);
		
		janeiro.adiciona(v1);
		janeiro.adiciona(v2);
		janeiro.adiciona(v3);

		System.out.println("O total de litros necessários para o trecho " + v1.getDestino() + " é: " + v1.litroGasto() + " litros.");
		System.out.println("O total de litros necessários para o trecho " + v2.getDestino() + " é: " + v2.litroGasto() + " litros.");
		System.out.println("O total de litros necessários para o trecho " + v3.getDestino() + " é: " + v3.litroGasto() + " litros.");
		
		System.out.println("O lucro deste trecho é: R$ " + v1.getLucroTrecho());
		System.out.println("O lucro deste trecho é: R$ " + v2.getLucroTrecho());
		System.out.println("O lucro deste trecho é: R$ " + v3.getLucroTrecho());
		
		System.out.println("O lucro total de " + v1.getTotalDeViagens() + " viagens desse trecho foi: R$ " + v1.getLucroTotalTrecho());
		System.out.println("O lucro total de " + v2.getTotalDeViagens() + " viagens desse trecho foi: R$ " + v2.getLucroTotalTrecho());
		System.out.println("O lucro total de " + v3.getTotalDeViagens() + " viagens desse trecho foi: R$ " + v3.getLucroTotalTrecho());
		
		System.out.println("O lucro total do mês foi: " + janeiro.getLucroMensal());
		System.out.println(janeiro.getViagem());
		
	}
}
