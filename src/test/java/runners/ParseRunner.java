package runners;
import org.xml.sax.SAXException;
import utilites.JsonParcer;


import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ParseRunner {
    static JsonParcer jsonParser = new JsonParcer();
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        {
            jsonParser.parseJSON();
            jsonParser.parseGSON();
            jsonParser.parseJackson();
            //jsonParser.fromGSON();

        }
    }
}