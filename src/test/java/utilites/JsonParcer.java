package utilites;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.json.JSONObject;
import runners.Recipe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

    public class JsonParcer {

        private final static String  JSON="src/test/Training/recipe.json";

        File file = new File(JSON);

        public void parseJSON()  throws IOException{
            String  input=new String(Files.readAllBytes(Paths.get(JSON)));
            JSONObject obj=new JSONObject(input);
            System.out.println(obj.getString("name"));
        }

        public void parseGSON() throws IOException{
            Gson gson = new Gson();
            Recipe recipe = gson.fromJson(new JsonReader(new FileReader(JSON)), Recipe.class);
            System.out.println(recipe.name);
        }
        public void parseJackson() throws IOException{
            ObjectMapper mapper = new ObjectMapper();
            Recipe recipe = mapper.readValue(file, Recipe.class);
            System.out.println(recipe.name);
        }

        public void fromGSON() throws FileNotFoundException{
            Gson gson = new Gson();
            Recipe recipe = new Recipe("Borsch", 120);
            System.out.println(gson.toJson(recipe));
        }
    }

