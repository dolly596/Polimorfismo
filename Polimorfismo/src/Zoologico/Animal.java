package Zoologico;

public class Animal {
	private String nome;
	private String sexo;
	private String raca;
	
	public Animal(String nome, String sexo, String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}

	public Animal() {
		
	}
	
	public void Dormir () {
		System.out.println("Dormindo");
	}
	public void Caminhar () {
		System.out.println("Caminhando");
	}
	public void Correr () {
		System.out.println("Correndo");
	}
	public void emitirSom() {
		System.out.println("Emitindo som");
	}

	
	public  String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public String getRaca() {
		return raca;
	}
	
}
