package com.apsh.legacy.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class Transformer<T> {

    public String java2Xml(T obj) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                Boolean.TRUE);
        jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
//            SchemaFactory sf =
//                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            Schema schema = sf.newSchema(
//                    StudentListFile);
//            jaxbMarshaller.setSchema(schema);
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        jaxbMarshaller.marshal(obj, ba);
        //System.out.println(ba);
        String xml = new String(ba.toByteArray(), StandardCharsets.UTF_8);
        return xml;
    }

}
