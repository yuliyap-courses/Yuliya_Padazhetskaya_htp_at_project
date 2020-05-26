package TrashMailImplement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MailImplement {

    public static void main (String[] args){
        FileInputStream file;
        Properties property = new Properties();

        try {
            file = new FileInputStream("src/test/java/properties/TrashMail.properties");
            property.load(file);


            String login = property.getProperty("EMAIL");
            String password = property.getProperty("PASSWORD");
        }

        catch (IOException e) {
            System.err.println("FILE IS NOT PRESENT!");
        }
    }
}
