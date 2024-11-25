package factory;

import model.CustomXml;
import model.XmlType;
import parser.FileParser;

public interface ParserFactory {
    FileParser getParser(XmlType xmlType);
}
