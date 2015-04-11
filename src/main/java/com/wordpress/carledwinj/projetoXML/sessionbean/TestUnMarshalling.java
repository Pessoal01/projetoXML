package com.wordpress.carledwinj.projetoXML.sessionbean;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import com.wordpress.carledwinj.projetoXML.pojo.Endereco;
import com.wordpress.carledwinj.projetoXML.pojo.Usuario;

public class TestUnMarshalling {

	public static void main(String[] args) {
		
		try {
			Usuario usuario = UnMarshalling.unMarshalling("novo_usuario.xml");
			
			System.out.println("Usuario " );
			System.out.println("Codigo: " + usuario.getCodigo());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Idade: " + usuario.getIdade());
			System.out.println("Lista de enderecos: ");
			for (Endereco endereco : usuario.getEnderecos()) {
				System.out.println("	Logradouro: " + endereco.getLogradouro() );
				System.out.println("	Numero: " + endereco.getNumero() );
				System.out.println("	Bairro: " + endereco.getBairro() );
				System.out.println("	Cidade: " + endereco.getCidade() );
				System.out.println("	País: " + endereco.getPais() +"\n" );
			}
			
			
		} catch (FileNotFoundException | JAXBException e) {
			System.out.println("Erro ao tentar ler arquivo xml externo.");
			e.printStackTrace();
		}
	}
}
