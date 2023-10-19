package Empresa;

public class PessoaJuridica extends Funcionario{

	
	public PessoaJuridica(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	
	
	public double calculaImposto (double valorBruto, double imposto) {
		return valorBruto - imposto;
	}
	
	
}
