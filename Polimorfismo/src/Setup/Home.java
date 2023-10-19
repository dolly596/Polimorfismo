package Setup;

public class Home implements Computador {

	
	@Override
	public void ligar() {
		System.out.println("O computador está prestes a ligar");
	}

	@Override
	public void reiniciar() {
		System.out.println("O computador está reiniciando, aguarde!");
	}
	@Override
	public void desligar() {
		System.out.println("O computador está prestes a desligar");
	}
	
	public void carregando() {
		System.out.println("Está carregando, aguarde!");
	}
}
