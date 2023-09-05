package dev.dembicki.message;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MicrosoftTeamsMessage {
    private String type;
    private String $schema;
    private String version;
    private List<Element> body;

    public MicrosoftTeamsMessage(MicrosoftTeamsMessageConcreteBuilder builder) {
        this.type = builder.type;
        this.$schema = builder.$schema;
        this.version = builder.version;
        this.body = builder.body;
    }

    public String getType() {
        return type;
    }

    public String get$schema() {
        return $schema;
    }

    public String getVersion() {
        return version;
    }

    public List<Element> getBody() {
        return body;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void set$schema(String $schema) {
        this.$schema = $schema;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setBody(List<Element> body) {
        this.body = body;
    }

    public void sendTo(String webhookUrl) {
        try {
            var messageJson = new ObjectMapper().writeValueAsString(this);
            try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
                HttpPost httpPost = new HttpPost(webhookUrl);
                httpPost.setEntity(new StringEntity(messageJson));
                httpPost.setHeader("Accept", "application/json");
                httpPost.setHeader("Content-type", "application/json");

                HttpResponse response = httpClient.execute(httpPost);
                int statusCode = response.getStatusLine().getStatusCode();

                if (statusCode == 200) {
                    String responseBody = EntityUtils.toString(response.getEntity());

                    System.out.println("Pomyslnie wysłano wiadomość do webhooka!");
                    System.out.println("Odpowiedź serwera: " + responseBody);
                } else {
                    System.out.println("Błąd HTTP: " + statusCode);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
