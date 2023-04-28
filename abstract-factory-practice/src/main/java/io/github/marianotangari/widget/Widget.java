package io.github.marianotangari.widget;

public abstract class Widget {

    protected String name;
    protected double height;
    protected double width;
    private static final double MAX_HEIGHT_WIDTH = 5000d;  // px
    private static final double MIN_HEIGHT_WIDTH = 10d;  // px

    public Widget setName(String name) {
        this.name = name;
        return this;
    }

    public Widget setWidth(double width) {

        this.width = width <= MAX_HEIGHT_WIDTH && width >= MIN_HEIGHT_WIDTH ? width : MIN_HEIGHT_WIDTH;

        return this;
    }

    public Widget setHeight(double height) {

        this.height = height <= MAX_HEIGHT_WIDTH && height >= MIN_HEIGHT_WIDTH ? height : MIN_HEIGHT_WIDTH;

        return this;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
