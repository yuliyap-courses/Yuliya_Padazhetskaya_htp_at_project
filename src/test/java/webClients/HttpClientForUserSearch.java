package webClients;

import ApplicationItems.NewSearchByUser;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

public class HttpClientForUserSearch {

    private static final String URL = "http://178.124.206.46:8001/app/ws/";

    public static String HttpResponce(@NotNull Gson gson, NewSearchByUser search) throws URISyntaxException, IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder(URL);
        HttpPost request = new HttpPost(builder.build());
        request.setEntity(new StringEntity(gson.toJson(search)));
        HttpResponse response = (HttpResponse) client.execute(request);
        String responseData = EntityUtils.toString(response());
        System.out.println(responseData);
        return responseData;
    }
}
