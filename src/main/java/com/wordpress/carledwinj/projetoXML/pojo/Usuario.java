package com.wordpress.carledwinj.projetoXML.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario {

	@XmlAttribute
	private Long codigo;
	
	@XmlElement
	private String nome;
	
	@XmlElement
	private Long idade;
	
	@XmlElementWrapper(name="lista-enderecos")
	@XmlElement(name="endereco")
	private List<Endereco> enderecos;
	
	public Usuario() {}

	public Usuario(Long codigo,String nome, Long idade, List<Endereco> enderecos) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.enderecos = enderecos;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
}
