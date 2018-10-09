package ru.gotoqa;

import mypackage.ActorCast;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

/**
 * @author Muflikhunov Roman
 */

public class JAXBParsingProject {
    private static final String XMLFILE = "D:\\JAVA\\Java_SRC\\JAXBParsingProject\\src\\main\\resources\\actors.xml";

    public static void main(String[] args) throws JAXBException {
        //Start Unmarshalling
        JAXBContext jaxbContext = JAXBContext.newInstance(ActorCast.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        ActorCast jaxbElement = (ActorCast) unmarshaller.unmarshal(new File(XMLFILE));
        //Stop Unmarshalling

        List<ActorCast.Cast> cast = jaxbElement.getCast();

        for(ActorCast.Cast cst : cast){
            System.out.println("========================================");
            System.out.println("Actor: " +cst.getActor().getFirstName()+" "+cst.getActor().getLastName()+", "+cst.getActor().getBirthDay());
            System.out.println("Character: " +cst.getCharacter().getFirstName()+" "+cst.getCharacter().getLastName());
        }

    }
}
