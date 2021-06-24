
package br.com.senai;

	import java.util.ArrayList;
	import java.util.List;

import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;
	
	public class ProgramaPrincipal {


	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList<Venda>();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);
				
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoConroller = new ProdutoController();
		VendaController vendaController = new VendaController();
		
		boolean sair = false;
	
		do {
			pessoaController.menu();
			
			int opcao = pessoaController.leopcao();
			switch(opcao) {
				case 1:
					pessoas.add(pessoaController.cadastrarPessoa());
					break;
					
				case 2:
					pessoaController.listarPessoas(pessoas);
					break;
					
				case 3:
					pessoaController.editarPessoa(pessoas);
					break;
				
			default:
				System.out.println("Opção invalida! ");
				break;
			}
			
			}while(!sair);
		
		System.out.println("Sistema finalizado!");
		
	}	
}
		
	
	
	
