package service;

import factory.ParserFactory;
import factory.ParserFactoryImpl;
import model.CustomXml;
import parser.FileParser;

public class DisplayServiceImpl implements DisplayService{

    @Override
    public void display(CustomXml customXml) {
        ParserFactory parserFactory = new ParserFactoryImpl();
        FileParser parser = parserFactory.getParser(customXml.getType());
        String displayMsg = parser.parse(customXml);
        System.out.println(displayMsg);
    }
}
