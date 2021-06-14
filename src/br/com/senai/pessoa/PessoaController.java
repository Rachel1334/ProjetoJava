package br.com.senai.pessoa;
import java.util.List;
import java.util.Scanner;

public class PessoaController {

	private Scanner tec;
	
	public PessoaController() {
		tec = new Scanner(System.in);
	}

	public int leopcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	public void menu() {
		System.out.println("\n---MENU---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("3) Cadastrar produtos");
		System.out.println("4) Listar produtos cadastrados");
		System.out.println("9) Sair do sistema");
		System.out.println("--------------------");

	}
	
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("--- Cadastrar pessoa--- ");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());
		
		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.print("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.println("Informe o País: ");
		tec.nextLine();
		pessoa.setPais(tec.nextLine());
		
		System.out.println("Informe o Estado: ");
		pessoa.setNomeDoEstado(tec.nextLine());
		
		System.out.println("Informe o nome da Cidade: ");
		pessoa.setNomeDaCidade(tec.nextLine());
		
		System.out.println("Informe o nome do Bairro: ");
		pessoa.setNomeDoBairro(tec.nextLine());
		
		System.out.println("Informe o Nome da Rua: ");
		pessoa.setNomeDaRua(tec.nextLine());
		
		System.out.println(" Informe o Complemento: ");
		pessoa.setComplemento(tec.nextLine());
		
		System.out.println("Informe o Número da Casa: ");
		pessoa.setNumero(tec.nextLine());
		
		
		return pessoa;
	}
		
		public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
			
			System.out.printf("| %20s | %5s | %5s | %6s| %10s | %15s | %15s | %15s | %20s | %10s | %6s\n", 
					"Nome", "Ano", "Idade", "Altura", "Pais", "Estado", "Cidade", "Bairro","Rua", "Complemento", "Número" );
			
		for(int i = 0; i<pessoas.size(); i++) {
			System.out.printf("| %20s | %5d | %5d | %6.2f| %10s | %15s | %15s | %15s | %20s | %11s | %6s ", 
			pessoas.get(i).getNome(),
			pessoas.get(i).getAnoDeNascimento(),
			pessoas.get(i).getIdade(),
			pessoas.get(i).getAltura(),
			pessoas.get(i).getPais(),
			pessoas.get(i).getNomeDoEstado(),
			pessoas.get(i).getNomeDaCidade(),
			pessoas.get(i).getNomeDoBairro(),
			pessoas.get(i).getNomeDaRua(),
			pessoas.get(i).getComplemento(),
			pessoas.get(i).getNumero());
			
		}	
		return pessoas;
		
	}
	
}
