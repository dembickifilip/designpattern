package dev.dembicki.message.cardelements;

public class TextBlock implements CardElement {
    private String text;
    private String type = "text";
    private String color = "default";

    public TextBlock(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }
}
