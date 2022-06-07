package lucrosMes;

public class Janeiro {

	public static void main(String[] args) {

		
		Viagem janeiro[] = new Viagem [3];
		
		janeiro [0] = new Viagem(100, 14.5, 6.89f, 180f, 5, "Florianopolis");
		janeiro[0].custoViagem();
		janeiro[0].custoTrecho();
		janeiro[0].lucroTrecho();
		
		System.out.println("o custo total do trecho é:" + janeiro[0].getTotalViagem());
		System.out.println("o custo total ao longo de " + janeiro[0].getNumeroViagens() + "foi: " + janeiro[0].getCustoTrecho());
		System.out.println("o lucro total foi: " + janeiro[0].getLucro());
		System.out.println(janeiro[0].getTrecho());
		System.out.println();
		
		janeiro[1] = new Viagem(13, 14.5, 6.89f, 100f, 7, "NVT");
		
		janeiro[1].custoViagem();
		janeiro[1].custoTrecho();
		janeiro[1].lucroTrecho();
		
		System.out.println(janeiro[1].getTotalViagem());
		System.out.println(janeiro[1].getCustoTrecho());
		System.out.println(janeiro[1].getLucro());		
		System.out.println(janeiro[1].getTrecho());
		System.out.println();
		
		janeiro[2] = new Viagem(12, 14.5, 6.89f, 20f, 50, "BC");
		
		janeiro[2].custoViagem();
		janeiro[2].custoTrecho();
		janeiro[2].lucroTrecho();
		
		System.out.println(janeiro[2].getTotalViagem());
		System.out.println(janeiro[2].getCustoTrecho());
		System.out.println(janeiro[2].getLucro());
		System.out.println(janeiro[2].getTrecho());
		System.out.println();

		System.out.println(janeiro[0].custoTrecho() + janeiro[1].custoTrecho() + janeiro[2].custoTrecho());
		System.out.println(janeiro[0].custoViagem() + janeiro[1].custoViagem() + janeiro[2].custoViagem());
		System.out.println(janeiro[0].lucroTrecho() + janeiro[1].lucroTrecho() + janeiro[2].lucroTrecho());
		
	}
}
