package gov.noaa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NdfdXMLBindingStubTest {

    @Test
    void latLonListZipCode() throws Exception{
        JAXBXMLToJava jaxbxmlToJava = new JAXBXMLToJava();

        assertEquals("43.0798,-89.3875", jaxbxmlToJava.JAXBXMLToJava("53714"));
    }
}