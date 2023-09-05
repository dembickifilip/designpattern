package dev.dembicki.message;

import java.util.List;

public interface MicrosoftTeamsMessageBuilder {
    String getType();

    void setType(String type);

    String get$schema();

    void set$schema(String $schema);

    String getVersion();

    void setVersion(String version);

    List<Element> getBody();

    void setBody(List<Element> body);

    MicrosoftTeamsMessageBuilder ofType(String type);

    MicrosoftTeamsMessageBuilder with$schema(String $schema);

    MicrosoftTeamsMessageBuilder withVersion(String version);

    MicrosoftTeamsMessageBuilder withBody(List<Element> body);

    MicrosoftTeamsMessageBuilder addTitle(String title);

    MicrosoftTeamsMessageBuilder addDescription(String description);

    MicrosoftTeamsMessageBuilder addImage(String url);

    MicrosoftTeamsMessage build();
}
