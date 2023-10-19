package Empresa;



public class Jornada extends Funcionario {
	
		
		public Jornada(long id, String nome, String telefone, int matricula, String endereco) {
			super(id, nome, telefone, matricula, endereco);
		}
		
		public double calculaSalario (double SalarioHora, double horasTrabalhadas) {
			return SalarioHora * horasTrabalhadas;
		}
		
		
		
	}

