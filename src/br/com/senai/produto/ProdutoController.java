package br.com.senai.produto;
import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class ProdutoController {

	private Scanner tec;
	
	public ProdutoController( ) {
		tec = new Scanner(System.in);
	}
	
	public int leopcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	public void menu() {
		System.out.println("\n---MENU---");
		System.out.println("3)cadastrar produto");
		System.out.println("4) Listar produto cadastradas");
		System.out.println("9)Sair do sistema");
		System.out.println("--------------------");
	}	
	
	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		
		System.out.println("--- Cadastrar produto--- ");
		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoPrdoduto(tec.nextLine());
	
		System.out.println("Informe o valor unitário do produto: ");
		produto.setValorUnitarioProduto(tec.nextDouble());
		
		System.out.println("Informe a quantidade do produto: ");
		produto.setQuantidadeDoPrdoduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioProduto() * produto.getQuantidadeDoPrdoduto());
		return produto;
	}
	   	public List<Produto> listarProdutos(List<Produto> produtos) {
	   	 
	   		System.out.printf(" %20s | %10s | %5s | %10s\n", 
	   				"Nome" , "Valor unitário" , "Quantidade do produto" , "Valor total do produto");
			for(int i = 0; i<produtos.size(); i++) {
				System.out.printf("%21s | %13s | %5s | %10s",
				produtos.get(i).getNomeDoPrdoduto(),
				produtos.get(i).getValorUnitarioProduto(),
				produtos.get(i).getQuantidadeDoPrdoduto(),
				produtos.get(i).getValorTotalDoProduto());
			}

	   	return produtos;	
 	}
}


