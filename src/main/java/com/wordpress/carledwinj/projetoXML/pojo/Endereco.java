package com.wordpress.carledwinj.projetoXML.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Endereco {

	@XmlElement
	private String logradouro;
	
	@XmlElement
	private String bairro;
	
	@XmlElement
	private String cidade;
	
	@XmlElement
	private String pais;
	
	@XmlElement
	private Long numero;
	
	public Endereco() {}

	public Endereco(String logradouro, String bairro, String cidade, String pais, Long numero) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.pais = pais;
		this.numero = numero;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	
}
