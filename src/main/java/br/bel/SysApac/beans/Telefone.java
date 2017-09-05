package br.bel.SysApac.beans;
/**
 * 
 * @author Belgrano
 * @Data 26/07/2017
 */
public class Telefone {
	
	private Integer ddd;
	private Integer numTelefone;
	
	public Telefone() {
		
	}
	public Telefone(Integer ddd, Integer numTelefone) {
		super();
		this.ddd = ddd;
		this.numTelefone = numTelefone;
	}
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public Integer getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(Integer numTelefone) {
		this.numTelefone = numTelefone;
	}
	
}
