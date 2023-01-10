interface Parsable {

    void parse(String fileName);
}

class ParserManager {

    public static Parsable getParser(String type) {
        if (type.equals("XML")) return new XMLParser();
        else {
            Parsable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parsable {

    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- XML Parsing completed.");
    }
}

class HTMLParser implements Parsable {

    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML Parsing completed.");
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parsable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");

        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
