package br.bel.SysApac.beans;

import java.util.Date;

import br.bel.SysApac.enums.EnumSexo;
/**
 * 
 * @author Belgrano
 * @Data 26/07/2017
 */
public class Paciente {
	
	private String nomePaciente;
	private Integer numProntuario;
	private Long cns;
	private Date dataNascimento;
	private EnumSexo sexo;
	private String raca;
	private String etinia;
	private String nomeMae;
	private String endereco;
	private String municipio;
	private Integer codIBGEMunicipio;
	private String uf;
	private Integer cep;
	private Telefone celular;
	private Telefone contato;
	
	public Paciente() {
		
	}
	
	public Paciente(String nomePaciente, Integer numProntuario, Long cns,
			Date dataNascimento, EnumSexo sexo, String raca, String etinia,
			String nomeMae, String endereco, String municipio,
			Integer codIBGEMunicipio, String uf, Integer cep, Telefone celular,
			Telefone contato) {
		this.nomePaciente = nomePaciente;
		this.numProntuario = numProntuario;
		this.cns = cns;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.raca = raca;
		this.etinia = etinia;
		this.nomeMae = nomeMae;
		this.endereco = endereco;
		this.municipio = municipio;
		this.codIBGEMunicipio = codIBGEMunicipio;
		this.uf = uf;
		this.cep = cep;
		this.celular = celular;
		this.contato = contato;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public Integer getNumProntuario() {
		return numProntuario;
	}
	public void setNumProntuario(Integer numProntuario) {
		this.numProntuario = numProntuario;
	}
	public Long getCns() {
		return cns;
	}
	public void setCns(Long cns) {
		this.cns = cns;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public EnumSexo getSexo() {
		return sexo;
	}
	public void setSexo(EnumSexo sexo) {
		this.sexo = sexo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getEtinia() {
		return etinia;
	}
	public void setEtinia(String etinia) {
		this.etinia = etinia;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public Integer getCodIBGEMunicipio() {
		return codIBGEMunicipio;
	}
	public void setCodIBGEMunicipio(Integer codIBGEMunicipio) {
		this.codIBGEMunicipio = codIBGEMunicipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public Telefone getCelular() {
		return celular;
	}
	public void setCelular(Telefone celular) {
		this.celular = celular;
	}
	public Telefone getContato() {
		return contato;
	}
	public void setContato(Telefone contato) {
		this.contato = contato;
	}
	
	
	
}
