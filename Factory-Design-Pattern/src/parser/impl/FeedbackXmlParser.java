package parser.impl;

import model.CustomXml;

public class FeedbackXmlParser implements XmlParser{
    @Override
    public String parse(CustomXml xml) {
        System.out.println("parsed Feedback Xml File");
        return xml.getMsg();
    }
}
