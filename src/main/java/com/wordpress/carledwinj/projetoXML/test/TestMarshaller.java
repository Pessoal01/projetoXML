package com.wordpress.carledwinj.projetoXML.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.wordpress.carledwinj.projetoXML.pojo.Endereco;
import com.wordpress.carledwinj.projetoXML.pojo.Usuario;
import com.wordpress.carledwinj.projetoXML.sessionbean.Marshalling;

public class TestMarshaller {
	
		public static void main(String[] args) {
		
		List<Endereco> enderecos = new ArrayList<>(); 
		enderecos.add(new Endereco("Rua Santos Silva", "Jardim Miranda", "Americana", "Brasil", 343L));
		enderecos.add(new Endereco("Rua Doutor Miguel", "Cidade das Flores", "Osasco", "Brasil", 976L));
		
		Usuario usuario = new Usuario(45L,"Marcos", 27L, enderecos);
		
		try {
			Marshalling.marshalling(usuario, "usuario.xml");
		} catch (FileNotFoundException | JAXBException e) {
			System.out.println("Erro ao tentar gerar o xml." );
			e.printStackTrace();
		}
	}
}
