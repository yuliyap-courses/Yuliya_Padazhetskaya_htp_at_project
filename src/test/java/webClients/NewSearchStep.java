package webClients;

import ApplicationItems.NewSearchByUser;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.stream.Collectors;

    public class NewSearchStep {
        public static String JSON = "src/test/resources/newSearchByUser.json";
        private static NewSearchByUser[] searches;

        public static NewSearchByUser getSearchDataFromFile(Gson gson, int condition) throws FileNotFoundException {
            searches = gson.fromJson (new JsonReader(new FileReader(JSON)),  NewSearchByUser[].class);
            return searches[condition];
        }

        public static List<String> ListNewUsers(String response) {
            Pattern pattern = Pattern.compile ("\"username\": \"[A-z]+\"");
            Matcher matcher = pattern.matcher (response);
            List<String> list = new ArrayList<>();
            while (((Matcher) matcher).find ())
                list.add (matcher.group ());
            list = list.stream ().map (s -> s.replaceAll ("\"username\": ", "")).map (s -> s.replaceAll ("\"", "")).collect (Collectors.toList ());
            return list;
        }

        public static boolean CheckNames(List<String> list, String check) {
            Pattern pattern = Pattern.compile (String.format ("^%s$", check));
            for (String x : list) {
                if (!pattern.matcher (x).matches ())
                    return false;
            }
            return true;
        }
    }



