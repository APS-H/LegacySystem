package com.example.legacy.data;

import com.example.legacy.entity.Employers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public class JavaToXml<T> {
    public String JavaToXml (T obj) throws Exception {
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
        String xml=new String(ba.toByteArray(), "utf-8");
        return xml;
    }
}
