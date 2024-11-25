package parser.impl;

import model.CustomXml;

public class ResponseXmlParser implements XmlParser{
    @Override
    public String parse(CustomXml xml) {
        System.out.println("parsed Response Xml");
        return xml.getMsg();
    }
}
