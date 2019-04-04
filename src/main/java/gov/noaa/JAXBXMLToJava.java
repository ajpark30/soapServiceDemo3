package gov.noaa;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;
import java.io.StringReader;

public class JAXBXMLToJava {


    public String JAXBXMLToJava(String zipcode) throws Exception {

        // create JAXB context and initializing Marshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        NdfdXMLBindingStub binder = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String response = binder.latLonListZipCode(zipcode);


        DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(response));

        return dwml.getLatLonList();
    }


}
