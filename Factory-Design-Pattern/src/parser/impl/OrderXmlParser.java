package parser.impl;

import model.CustomXml;

public class OrderXmlParser implements XmlParser{
    @Override
    public String parse(CustomXml xml) {
        System.out.println("parsed order Xml");
        return xml.getMsg();
    }
}
