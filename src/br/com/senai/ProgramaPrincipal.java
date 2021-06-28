
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
			
			
				System.out.println("-----MENU PRINCIPAL-----");
				System.out.println("1)--Pessoa--");
				System.out.println("2)--Produto--");
				System.out.println("3)--Venda--");
				System.out.println("4)--Sair do Sistema--");
				
			
			
			int opcao = pessoaController.leopcao();
			switch(opcao) {
				case 1:
					pessoaController.menu1(pessoas);
					break;
					
				case 2:
					produtoConroller.menu2(produtos);
					break;
					
				case 3:
					vendaController.menu3(pessoas, produtos, vendas);
					break;
				
			default:
				System.out.println("Opção invalida! ");
				break;
			}
			
			}while(!sair);
		
		System.out.println("Sistema finalizado!");
		
	}	
}
		
	
	
	
