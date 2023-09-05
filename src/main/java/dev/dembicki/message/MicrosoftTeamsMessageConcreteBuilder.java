package dev.dembicki.message;

import java.util.ArrayList;
import java.util.List;

import dev.dembicki.message.cardelements.Image;
import dev.dembicki.message.finalElements.Description;
import dev.dembicki.message.finalElements.Title;

public class MicrosoftTeamsMessageConcreteBuilder implements MicrosoftTeamsMessageBuilder {
    public String type;
    public String $schema;
    public String version;
    public List<Element> body;

    private static final String DEFAULT_TYPE = "AdaptiveCard";

    public MicrosoftTeamsMessageConcreteBuilder() {
        this.type = DEFAULT_TYPE;
        this.body = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String get$schema() {
        return $schema;
    }

    public void set$schema(String $schema) {
        this.$schema = $schema;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Element> getBody() {
        return body;
    }

    public void setBody(List<Element> body) {
        this.body = body;
    }

    public MicrosoftTeamsMessageConcreteBuilder ofType(String type) {
        this.type = type;
        return this;
    }

    public MicrosoftTeamsMessageConcreteBuilder with$schema(String $schema) {
        this.$schema = $schema;
        return this;
    }

    public MicrosoftTeamsMessageConcreteBuilder withVersion(String version) {
        this.version = version;
        return this;
    }

    public MicrosoftTeamsMessageConcreteBuilder withBody(List<Element> body) {
        this.body = body;
        return this;
    }

    public MicrosoftTeamsMessageConcreteBuilder addTitle(String title) {
        this.body.add(new Title(title));
        return this;
    }

    public MicrosoftTeamsMessageConcreteBuilder addDescription(String description) {
        this.body.add(new Description(description));
        return this;
    }

    public MicrosoftTeamsMessageConcreteBuilder addImage(String url) {
        this.body.add(new Image(url));
        return this;
    }

    public MicrosoftTeamsMessage build() {
        return new MicrosoftTeamsMessage(this);
    }
}
