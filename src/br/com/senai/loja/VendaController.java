package br.com.senai.loja;


import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class VendaController {
	
	private Scanner tec;
	private ProdutoController produtoController;
	private PessoaController pessoaController;
	
	public VendaController() {
		tec = new Scanner(System.in);
		 produtoController = new ProdutoController();
		pessoaController = new PessoaController();
		
	}
	public int leOpcao() {
		System.out.println(" > ");
		return tec.nextInt();
	}
	
	public List<Venda> listarVenda(List<Venda> vendas) {
		
		System.out.println("-----VENDAS REALIZADAS-----");
		
		System.out.printf(" %10s | %10s | %4s | %6s |\n",
				"Cliente","Produto","Qtd","Valor"
				);
		 for (int i = 0; i < vendas.size(); i++) {		

			System.out.printf(" %10s | %10s | %4d | %6.2f |\n",
					vendas.get(i).getPessoa().getNome(),
					vendas.get(i).getProduto().getNomeDoPrdoduto(),
					vendas.get(i).getQuantidade(),
					vendas.get(i).getValor()
					);
		
		 }
		return vendas;
	}
	public Venda cadastrarVenda(List<Produto>produtos,List<Pessoa>pessoas) {
		
		
		if(produtos.isEmpty() || pessoas.isEmpty()) {
			System.out.println("Impossível cadastrar vendas sem PRODUTOS ou PESSOAS cadastradas.");
	
		return null;
	}
		produtoController.listarProdutos(produtos);
		pessoaController.listarPessoas(pessoas);
		
		Venda venda = new Venda();
		Produto produto = new Produto();
		Pessoa pessoa = new Pessoa();
		
		int idPessoa = tec.nextInt();
		
		pessoa.setNome(pessoas.get(idPessoa).getNome());
		pessoa.setAltura(pessoas.get(idPessoa).getAltura());
		pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
		
		venda.setPessoa(pessoa);
		
		System.out.print("Informe o Id do produto: ");
		int idProduto = tec.nextInt() - 1;
		
		produto.setNomeDoPrdoduto(produtos.get(idProduto).getNomeDoPrdoduto());
		produto.setQuantidadeDoPrdoduto(produtos.get(idProduto).getQuantidadeDoPrdoduto());
		produto.setValorUnitarioProduto(produtos.get(idProduto).getValorUnitarioProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
		
		venda.setProduto(produto);
		
		System.out.print("Informe a quantidade desejada: ");
		venda.setQuantidade(tec.nextInt());
		
		venda.setValor(produto.getValorUnitarioProduto() * venda.getQuantidade());
		return venda;
	
	}
	public void menu3(List<Pessoa> pessoas,List<Produto> produtos,List<Venda> vendas) {
		System.out.println("-----MENU-----");
		System.out.println("1)CADASTRAR");
		System.out.println("2)LISTAR");
					
			int opcao = 0;
			switch(opcao) {
			case 1:
					vendas.add(cadastrarVenda(produtos,pessoas));			
					break;
			case 2:
					listarVenda(vendas);
					break;
			default:
				System.out.println("Opção ivaida!");
				break;
			}
		}
	
			}
			
			




