package factory;

import model.CustomXml;
import model.XmlType;
import parser.FileParser;
import parser.impl.ErrorXmlParser;
import parser.impl.FeedbackXmlParser;
import parser.impl.OrderXmlParser;
import parser.impl.ResponseXmlParser;

public class ParserFactoryImpl implements ParserFactory{
    @Override
    public FileParser getParser(XmlType type) {

        if(XmlType.ERROR.equals(type)) {
            return new ErrorXmlParser();
        }
        if(XmlType.FEEDBACK.equals(type)) {
            return new FeedbackXmlParser();
        }
        if(XmlType.ORDER.equals(type)) {
            return new OrderXmlParser();
        }
        if(XmlType.RESPONSE.equals(type)) {
            return new ResponseXmlParser();
        }

        throw new RuntimeException("Invalid Xml");
    }
}
