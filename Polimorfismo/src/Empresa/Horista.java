package Empresa;

public class Horista extends Funcionario {

	
	public Horista(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	
	}
	
	
	public double calculaSalario (double valorHora, double quantidadeHora) {
		return valorHora * quantidadeHora;
	}

}
