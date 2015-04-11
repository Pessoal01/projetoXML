package com.wordpress.carledwinj.projetoXML.sessionbean;

import java.io.File;
import java.io.FileNotFoundException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.wordpress.carledwinj.projetoXML.pojo.Usuario;

/**
 * 
 * @author CarlEdwin
 *
 */
@Stateless
@LocalBean
public class Marshalling {

     public Marshalling() {}
     
     public static File marshalling(Usuario usuario, String filePath) throws JAXBException, FileNotFoundException{
    	 
    	 JAXBContext context = JAXBContext.newInstance(Usuario.class);
    	 
    	 Marshaller marshaller = context.createMarshaller();
    	 
    	 File file = new File(filePath);
    	 
    	 marshaller.marshal(usuario, file);
    	 
    	 return file;
     }

}
