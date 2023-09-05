package dev.dembicki.cardelements;

public class Image implements CardElement {
    private String url;
    private String type = "Image";
    private String size = "auto";

    public Image(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
