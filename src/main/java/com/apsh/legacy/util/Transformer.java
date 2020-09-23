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
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        jaxbMarshaller.marshal(obj, ba);
        return new String(ba.toByteArray(), StandardCharsets.UTF_8);
    }

}
