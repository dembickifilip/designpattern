package dev.dembicki.finalElements;

import dev.dembicki.cardelements.TextBlock;

public class Description extends TextBlock {
  private String wrap = "true";
  private String weight = "normal";

  public Description(String text) {
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
