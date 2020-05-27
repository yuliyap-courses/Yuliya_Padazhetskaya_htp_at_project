package runners;

import org.xml.sax.SAXException;
import utilites.SearchParser;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class SearchRunner {


    static SearchParser searchParser = new SearchParser();

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        searchParser.searchJSON();

    }
}