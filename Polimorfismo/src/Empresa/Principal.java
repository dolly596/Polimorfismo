package Empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Jornada jor = new Jornada (1,"Otavio","15996373766",3131,"Rua Benedito Bento Mariano");
		
		Horista hor = new Horista (1,"Otavio","15996373766",3131,"Rua Benedito Bento Mariano");
		PessoaJuridica pj = new PessoaJuridica (1,"Otavio","15996373766",3131,"Rua Benedito Bento Mariano");
		double sh;
		double ht;
		double vh;
		double qh;
		double vb;
		double imposto;
		
		System.out.print("Informe o valor de quanto ganha por hora: ");
		sh = ler.nextDouble();
		
		System.out.print("Informe quantas horas trabalhou: ");
		ht = ler.nextDouble();
		
		System.out.println("Jornada: ");
		System.out.println(jor.getId());
		System.out.println(jor.getNome());
		System.out.println(jor.getTelefone());
		System.out.println(jor.getMatricula());
		System.out.println(jor.getEndereco());
		System.out.println("O seu salário é: " + jor.calculaSalario(sh, ht));
		
		
		System.out.println("\n");
		
		System.out.print("Informe o valor de quanto ganha por hora: ");
		vh = ler.nextDouble();
		
		System.out.print("Informe quantas horas trabalhou: ");
		qh = ler.nextDouble();
		
		System.out.println("Horista: ");
		System.out.println(hor.getId());
		System.out.println(hor.getNome());
		System.out.println(hor.getTelefone());
		System.out.println(hor.getMatricula());
		System.out.println(hor.getEndereco());
		System.out.println("O seu salário é: " + hor.calculaSalario(vh,qh ));
		
		System.out.println("\n");
		System.out.println("Pessoa Juridica: ");
		
		System.out.print("Informe o valor bruto: ");
		vb = ler.nextDouble();
		
		System.out.print("Informe o valor do imposto: ");
		imposto = ler.nextDouble();
		
		System.out.println(pj.getId());
		System.out.println(pj.getNome());
		System.out.println(pj.getTelefone());
		System.out.println(pj.getMatricula());
		System.out.println(pj.getEndereco());
		System.out.println("O seu salário é: " + pj.calculaImposto(vb,imposto ));

	}

}
