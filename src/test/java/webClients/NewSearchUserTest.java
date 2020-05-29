package webClients;

import ApplicationItems.NewSearchByUser;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class NewSearchUserTest {

    static Gson gson;

    @BeforeClass
    public static void preCondition() {
        gson = new Gson();
    }

    @Test
    public void allUsersTest() throws IOException, URISyntaxException {
        NewSearchByUser search = NewSearchStep.getSearchDataFromFile(gson, 0);
        String response = HttpClientForUserSearch.HttpResponce(gson, search);
        List<String> list = NewSearchStep.ListNewUsers(response);
        list.forEach(System.out::println);
        Assert.assertEquals(6, list.size());
    }

    @Test
    public void partialShortTest() throws IOException, URISyntaxException {
        NewSearchByUser search = NewSearchStep.getSearchDataFromFile(gson, 1);
        String response = HttpClientForUserSearch.HttpResponce(gson, search);
        List<String> list = NewSearchStep.ListNewUsers(response);
        list.forEach(System.out::println);
        Assert.assertTrue(NewSearchStep.CheckNames(list, "ff"));
    }
}