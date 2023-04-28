package io.github.marianotangari.widget;

public abstract class Widget {

    protected String name;
    protected double height;
    protected double width;
    private static final double MAX_HEIGHT = 5000d;  // px
    private static final double MAX_WIDTH = 5000d;  // px
    private static final double MIN_HEIGHT = 10d;  // px
    private static final double MIN_WIDTH = 10d;  // px

    public Widget setName(String name) {
        this.name = name;
        return this;
    }

    public Widget setWidth(double width) {

        if (width <= MAX_WIDTH && width >= MIN_WIDTH) {
            this.width = width;
        } else {
            this.width = MIN_WIDTH;
        }

        return this;
    }

    public Widget setHeight(double height) {

        if (width <= MAX_HEIGHT && width >= MIN_HEIGHT) {
            this.height = height;
        } else {
            this.height = MIN_HEIGHT;
        }

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
