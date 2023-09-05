package dev.dembicki.message.finalElements;

import dev.dembicki.message.cardelements.TextBlock;

public class Title extends TextBlock {
    private String wrap = "true";
    private String weight = "bolder";

    public Title(String text) {
        super(text);
    }

    public String getWrap() {
        return wrap;
    }

    public String getWeight() {
        return weight;
    }

    public void setWrap(String wrap) {
        this.wrap = wrap;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
