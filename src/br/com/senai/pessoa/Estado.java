package br.com.senai.pessoa;

public class Estado extends Pais {
	
	
	
	private String NomeDoEstado;
	public String getNomeDoEstado() {
		return NomeDoEstado;
	}
	public void setNomeDoEstado(String nomeDoEstado) {
		NomeDoEstado = nomeDoEstado;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	private String UF;

}
