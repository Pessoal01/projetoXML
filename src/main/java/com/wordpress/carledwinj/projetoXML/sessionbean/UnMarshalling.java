package com.wordpress.carledwinj.projetoXML.sessionbean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.wordpress.carledwinj.projetoXML.pojo.Usuario;

/**
 * 
 * @author CarlEdwin
 *
 */
@Stateless
@LocalBean
public class UnMarshalling {

    public UnMarshalling() {}
    
    public static Usuario unMarshalling(String filePath) throws JAXBException, FileNotFoundException{
    	
    	JAXBContext context = JAXBContext.newInstance(Usuario.class);
    	
    	Unmarshaller unMarshaller = context.createUnmarshaller();
    	
    	FileInputStream fileInputStream = new FileInputStream(filePath); 
    	
    	return (Usuario) unMarshaller.unmarshal(fileInputStream);
    }

}
