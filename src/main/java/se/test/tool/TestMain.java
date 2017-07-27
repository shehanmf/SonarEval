package se.test.tool;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

public class TestMain
{
    final static String blockerUrl = "https://sonarcloud.io/api/issues/search?componentRoots=eu.europa.ec.fisheries.uvms.activity%3Aactivity&severities=BLOCKER";
    final static String blockerUrlPath = "";

    public static void main(String[] args)
    {

        System.out.println("Starting");
        WebClient client = WebClient.create(blockerUrl, Collections.singletonList(new JacksonJsonProvider()));
        client.accept(MediaType.APPLICATION_JSON_TYPE);

//        client.path(blockerUrlPath);
        MyIssues response = client.get(MyIssues.class);
        System.out.println("End");
    }
}
