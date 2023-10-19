package Zoologico;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Animal: ");
		Animal animal1 = new Animal ("Ayra", "Feminino", "Husky");
		
		System.out.println(animal1.getNome());
		System.out.println(animal1.getSexo());
		System.out.println(animal1.getRaca());
		
		System.out.println("\n");
		System.out.println("Lobo: ");
		Lobo lobo = new Lobo ("Ayra", "Feminino", "Husky");
		lobo.emitirSom();
		
		System.out.println("\n");
		System.out.println("Tigre: ");
		Tigre tigre = new Tigre ("Dino", "Masculino", "Branco");
		tigre.emitirSom();
		
		
		System.out.println("\n");
		System.out.println("Cachorro: ");
		Cachorro cachorro = new Cachorro ("Xodó", "Feminino", "Poodle");
		cachorro.emitirSom();
		
		
		System.out.println("\n");
		System.out.println("Gato: ");
		Gato gato = new Gato ("Chorão", "Masculino", "Vira-lata");
		gato.emitirSom();
	}

}
