package br.com.senai.produto;
//CLASSE
public class Produto {
	
	//ATRIBUTOS
	private String nomeDoPrododuto;
	private double valorUnitarioProduto;
	private double quantidadeDoPrdoduto;
	private double valorTotalDoProduto;
	
	//CONSTRUTOR
	public Produto() {
	}
	
	public Produto(String nomeDoPrdoduto, double valorUnitarioProduto, int quantidadeDoPrdoduto,
			double valorTotalDoProduto) {
		this.nomeDoPrododuto = nomeDoPrdoduto;
		this.valorUnitarioProduto = valorUnitarioProduto;
		this.quantidadeDoPrdoduto = quantidadeDoPrdoduto;
		this.valorTotalDoProduto = valorTotalDoProduto;
	}

	//METODOS
	public String getNomeDoPrdoduto() {
		return nomeDoPrododuto;
	}
	public void setNomeDoPrdoduto(String nomeDoPrdoduto) {
		this.nomeDoPrododuto = nomeDoPrdoduto;
	}
	public double getValorUnitarioProduto() {
		return valorUnitarioProduto;
	}
	public void setValorUnitarioProduto(double valorUnitarioProduto) {
		this.valorUnitarioProduto = valorUnitarioProduto;
	}
	public int getQuantidadeDoPrdoduto() {
		return (int) quantidadeDoPrdoduto;
	}
	public void setQuantidadeDoPrdoduto(double String) {
		this.quantidadeDoPrdoduto = String;
	}
	public double getValorTotalDoProduto() {
		return valorTotalDoProduto;
	}
	public void setValorTotalDoProduto(double valorTotalDoProduto) {
		this.valorTotalDoProduto = valorTotalDoProduto;
	}

	public void setQuantidadeDoPrdoduto(int quantidadeDoPrdoduto2) {
		// TODO Auto-generated method stub
		
	}

	public void setQuantidadeDoPrdoduto(String next) {
		// TODO Auto-generated method stub
		
	}

	

}
