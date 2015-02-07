
import impl.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Created by yoannlt on 07/02/15.
 */
public class Creer {
    public static void main(String[] args ) {
        try {
            JAXBContext jc = JAXBContext.newInstance( "enchere.xml");
            impl.ObjectFactory factory = new impl.ObjectFactory();

            //Création des objets à faire
            EnchereTypeImpl enchere1 = new EnchereTypeImpl();

            Marshaller m = jc.createMarshaller();
            m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(enchere1, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
