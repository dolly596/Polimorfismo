package Setup;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Gamer: ");
		Gamer gm1 = new Gamer ();
		
		gm1.ligar();
		gm1.reiniciar();
		gm1.desligar();
		gm1.carregando();
		
		System.out.println("\n");
		System.out.println("Casa:");
		
		Home casa = new Home ();
		
		casa.ligar();
		casa.reiniciar();
		casa.desligar();
		casa.carregando();
	}
}
