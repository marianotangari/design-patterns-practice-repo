package io.github.marianotangari.widget;

public class Label extends Widget {

    private String color;

    public Label setColor(String color) {
        this.color = color;
        return this;
    }

    public String getColor() {
        return color;
    }
}
