package br.com.senai.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
		public static void main(String[] args) {
			
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			
			Pessoa pessoa1 = new Pessoa();
			Pessoa pessoa2 = new Pessoa();
			Pessoa pessoa3 = new Pessoa();
			Pessoa pessoa4 = new Pessoa();
			Pessoa pessoa5 = new Pessoa();
			
			
			pessoa1.setNome("Larissa");
			pessoa1.setAnoDeNascimento(2004);
			pessoa1.setSexo("F");
			
			pessoa2.setNome("Jonathan");
			pessoa2.setAnoDeNascimento(1990);
			pessoa2.setSexo("M");
			
			pessoa3.setNome("Mayara");
			pessoa3.setAnoDeNascimento(1985);
			pessoa3.setSexo("F");
			
			pessoa4.setNome("Livía");
			pessoa4.setAnoDeNascimento(2005);
			pessoa4.setSexo("M");
			
			pessoa5.setNome("Anthony");
			pessoa5.setAnoDeNascimento(1980);
			pessoa5.setSexo("M");
			
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
			pessoas.add(pessoa4);
			pessoas.add(pessoa5);
			
			
			for(Pessoa people : pessoas) {
				System.out.println(people.getNome());
				System.out.println(people.getAnoDeNascimento());
				System.out.println(people.getSexo());
				System.out.println("---------------------------");
				
				
			Scanner tec = new Scanner(System.in);
			MetodoController metodoController = new MetodoController();
				
			System.out.println("---TABUADA---");
			metodoController.multiplicar();
			
			
			System.out.println("---SOMA DE DOIS VALORES---");
			System.out.println(" A soma da: " +  metodoController.somar());
			
			System.out.println("--- SUBTRAÇÃO DE VALORES por parâmetros ---");
			System.out.println("Informe o primeiro valor: ");
			int valor1 = tec.nextInt();
			System.out.println("Informe o segundo valor: ");
			int valor2 = tec.nextInt();
			
			System.out.println("A subtração dá: "+ metodoController.subtrair(valor1, valor2));
 
			
			}
		}
}
