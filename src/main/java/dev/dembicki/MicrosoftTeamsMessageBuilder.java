package dev.dembicki;

import java.util.List;

import dev.dembicki.cardelements.Image;
import dev.dembicki.finalElements.Description;
import dev.dembicki.finalElements.Title;

public class MicrosoftTeamsMessageBuilder {
    public String type;
    public String $schema;
    public String version;
    public List<Element> body;

    private static final String DEFAULT_TYPE = "AdaptiveCard";

    public MicrosoftTeamsMessageBuilder() {
        this.type = DEFAULT_TYPE;
    }

    public MicrosoftTeamsMessageBuilder ofType(String type) {
        this.type = type;
        return this;
    }

    public MicrosoftTeamsMessageBuilder with$schema(String $schema) {
        this.$schema = $schema;
        return this;
    }

    public MicrosoftTeamsMessageBuilder withVersion(String version) {
        this.version = version;
        return this;
    }

    public MicrosoftTeamsMessageBuilder withBody(List<Element> body) {
        this.body = body;
        return this;
    }

    public MicrosoftTeamsMessageBuilder addTitle(String title) {
        this.body.add(new Title(title));
        return this;
    }

    public MicrosoftTeamsMessageBuilder addDescription(String description) {
        this.body.add(new Description(description));
        return this;
    }

    public MicrosoftTeamsMessageBuilder addImage(String url) {
        this.body.add(new Image(url));
        return this;
    }

    public MicrosoftTeamsMessage build() {
        return new MicrosoftTeamsMessage(this);
    }
}
