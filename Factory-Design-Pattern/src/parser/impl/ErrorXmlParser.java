package parser.impl;

import model.CustomXml;

public class ErrorXmlParser implements XmlParser{

    @Override
    public String parse(CustomXml xml) {
        System.out.println("parsed error xml parser");
        return xml.getMsg();
    }
}
