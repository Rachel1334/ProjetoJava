package br.com.senai;

public class ProgramaPrincipal {
		public static void main(String[] args) {
			
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
			
			System.out.println("--- Pessoa 1 ---");
			System.out.println(pessoa1.getNome());
			System.out.println(pessoa1.getAnoDeNascimento());
			System.out.println(pessoa1.getSexo());
			
			System.out.println("--- Pessoa 2 ---");
			System.out.println(pessoa2.getNome());
			System.out.println(pessoa2.getAnoDeNascimento());
			System.out.println(pessoa2.getSexo());

			System.out.println("--- Pessoa 3 ---");
			System.out.println(pessoa3.getNome());
			System.out.println(pessoa3.getAnoDeNascimento());
			System.out.println(pessoa3.getSexo());
			
			System.out.println("--- Pessoa 4 ---");
			System.out.println(pessoa4.getNome());
			System.out.println(pessoa4.getAnoDeNascimento());
			System.out.println(pessoa4.getSexo());
			
			System.out.println("--- Pessoa 5 ---");
			System.out.print(pessoa5.getNome());
			System.out.print(pessoa5.getAnoDeNascimento());
			System.out.println(pessoa5.getSexo());
			
		
		}
}
