package br.com.senai.endereco;

public class Endereco extends Cidade {
	
	private String Endereço;
	private String NomeDoBairro;
	private String NomeDaRua;
	private String Complemento;
	private String Numero;
	public String getEndereço() {
		return Endereço;
	}
	public void setEndereço(String endereço) {
		Endereço = endereço;
	}
	public String getNomeDoBairro() {
		return NomeDoBairro;
	}
	public void setNomeDoBairro(String nomeDoBairro) {
		NomeDoBairro = nomeDoBairro;
	}
	public String getNomeDaRua() {
		return NomeDaRua;
	}
	public void setNomeDaRua(String nomeDaRua) {
		NomeDaRua = nomeDaRua;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	
	
}
