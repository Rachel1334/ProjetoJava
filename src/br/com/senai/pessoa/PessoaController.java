  package br.com.senai.pessoa;
import java.util.List;
import java.util.Scanner;

import br.com.senai.produto.Produto;

public class PessoaController {

	private Scanner tec;
	
	public PessoaController() {
		tec = new Scanner(System.in);
	}

	public int leopcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	public void menu(){
		System.out.println("-----MENU PRINCIPAL-----");
		System.out.println("1)--Pessoa--");
		System.out.println("2)--Produto--");
		System.out.println("3)--Venda--");
		System.out.println("4)--Sair do Sistema--");
		
		//System.out.println("\n---MENU---");
		//System.out.println("1) Cadastrar pessoa");
		//System.out.println("2) Listar pessoas cadastradas");
		//System.out.println("3) Editar pessoa");
		//System.out.println("4) Excluir pessoa");
		//System.out.println("5) Cadastrar produtos");
		//System.out.println("6) Listar produtos cadastrados");
		//System.out.println("7) Editar produto");
		//System.out.println("8) Excluir produto");
		//System.out.println("9) Sair do sistema");
		//System.out.println("10) Listar vendas");
		//System.out.println("11) Cadatrar venda");
		//System.out.println("--------------------");

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
			
			if(pessoas.isEmpty()) {
				   ///.size() <= 0) OU USA ESSE
				System.out.println("Não possui dados para listar.");
				return null;
			}
			
			System.out.printf(" %2s | %20s | %5s | %5s | %6s| %10s | %15s | %15s | %15s | %20s | %10s | %6s\n", 
					"Id","Nome", "Ano", "Idade", "Altura", "Pais", "Estado", "Cidade", "Bairro","Rua", "Complemento", "Número" );
			
		for(int i = 0; i<pessoas.size(); i++) {
			System.out.printf(" %2d | %20s | %5d | %5d | %6.2f| %10s | %15s | %15s | %15s | %20s | %11s | %6s \n ", 
			i + 1,//INTERAÇÃO DO FOR
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
		public List <Pessoa> editarPessoa(List<Pessoa> pessoas) {
	   		
	   		Pessoa pessoa = new Pessoa();
	   		listarPessoas(pessoas);
	   		
	   		if(pessoas.isEmpty()) {
	   		}
	   		System.out.println("Informe o Id do produto para editar: ");
		   	int idPessoa = tec.nextInt() - 1;
		   	
		   	System.out.println("1) Nome da pessoa");
	   		System.out.println("2) Ano de Nascimento");
	   		System.out.println("3) Altura");
	   		System.out.println("4) Pais");
	   		System.out.println("5) Estado");
	   		System.out.println("6) Cidade");
	   		System.out.println("7) Bairro");
	   		System.out.println("8) Rua");
	   		System.out.println("9) Complemento");
	   		System.out.println("10) Numero");
	   		System.out.println("Informe o campo para ser editado:" );
	   		int opcao = tec.nextInt();
	   		
			switch(opcao) {
   			case 1: 
   				System.out.println("--- Editar nome da Pessoa ---");
   				System.out.println("Informe o novo nome da Pessoa: ");
   				pessoa.setNome(tec.next());
   				
   				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
   				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
   				pessoa.setPais(pessoas.get(idPessoa).getPais());
   				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
   				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
   				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
   				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
   				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
   				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
   		
   				pessoas.set(idPessoa, pessoa);
   				break;
   		
   				
   			case 2:
   				System.out.println("--- Editar Ano de Nascimento ---");
   				System.out.println("Informe o novo ano de nascimento: ");
   				pessoa.setAnoDeNascimento(tec.next());
   				
   				pessoa.setNome(pessoas.get(idPessoa).getNome());
   				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
   				pessoa.setPais(pessoas.get(idPessoa).getPais());
   				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
   				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
   				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
   				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
   				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
   				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
   				
   				pessoas.set(idPessoa, pessoa);
   				break;
   				
   			case 3:
   				System.out.println("--- Editar a Altura ---");
   				System.out.println("Informe a nova altura: ");
   				pessoa.setAltura(tec.next());
   				
   				pessoa.setNome(pessoas.get(idPessoa).getNome());
   				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
   				pessoa.setPais(pessoas.get(idPessoa).getPais());
   				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
   				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
   				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
   				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
   				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
   				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
   		    break;
   		    
   			case 4 :
   				System.out.println("Editar o País");
   				System.out.println("Informe novo País");
   				pessoa.setPais(tec.next());
   				
   				pessoa.setNome(pessoas.get(idPessoa).getNome());
   				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
   				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
   				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
   				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
   				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
   				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
   				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
   				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
   				
   				break;
   			case 5:
   				System.out.println("Editar o  Estado ");
   				System.out.println("Informe o novo estado: ");
   				pessoa.setNomeDoEstado(tec.next());
   				
   			pessoa.setNome(pessoas.get(idPessoa).getNome());
   				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
   				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
   				pessoa.setPais(pessoas.get(idPessoa).getPais());
   				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
   				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
   				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
   				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
   				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
   				
   				break;
   				
   			case 6:
   				System.out.println("Editar a Cidade");
   				System.out.println("Informe a nova cidade: ");
   				pessoa.setNome(pessoas.get(idPessoa).getNome());
   				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
   				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
   				pessoa.setPais(pessoas.get(idPessoa).getPais());
   				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
   				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
   				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
   				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
   				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
   				
   				break;
   				
   			case 7:
   				System.out.println("Editar o Bairro");
   				System.out.println("informe o novo Bairro: "); 
   				
   				pessoa.setNome(pessoas.get(idPessoa).getNome());
   				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
   				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
   				pessoa.setPais(pessoas.get(idPessoa).getPais());
   				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
   				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
   				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
   				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
   				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
   				
   				break;
   				
   			case 8:
   				System.out.println("Editar a Rua");
   				System.out.println("Informe a nova rua:");
   				
   				pessoa.setNome(pessoas.get(idPessoa).getNome());
   				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
   				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
   				pessoa.setPais(pessoas.get(idPessoa).getPais());
   				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
   				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
   				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
   				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
   				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
   				
   				break;
   				
   			case 9:
   				System.out.println("Editar Complemento");
   				System.out.println("Informe o novo complemento: ");
   				
   				pessoa.setNome(pessoas.get(idPessoa).getNome());
   				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
   				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
   				pessoa.setPais(pessoas.get(idPessoa).getPais());
   				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
   				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
   				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
   				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
   				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
   				
   				break;
   				
   			case 10:
   				System.out.println("Editar o número");
   				System.out.println("Informe o novo número: ");
   				
   				pessoa.setNome(pessoas.get(idPessoa).getNome());
   				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
   				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
   				pessoa.setPais(pessoas.get(idPessoa).getPais());
   				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
   				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
   				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
   				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
   				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
   			
   				break;
   				
   			default:
   				
   				System.out.println("opção inválida!");
   				break;
   		}
			return pessoas;	
}
	 	public void excluirPessoa(List<Pessoa>pessoas) {
	   		listarPessoas(pessoas);
	   		
	   		if(pessoas.isEmpty()) {
	   			
	   			return;
	   		}
		System.out.println("-----Excluir Pessoa-----");
		
		System.out.println("Informe o Id de produto para excluir:");
		int idPessoa = tec.nextInt() - 1;
		
		if(pessoas.size() <= idPessoa) {
			System.out.println("Pessoa não cadastrado.");
			return;
		}
		pessoas.remove(idPessoa);
		
		}
	 	
	 	public void primerio() {
	 	System.out.printf("----MENU----");
		System.out.println("1)Cadastrar Pessoa");	
		System.out.println("2)Listar pessoas cadastrados");
		System.out.println("3)Editar pessoas");
		System.out.println("4)Excluir pessoa");
		
		
	 	}
}