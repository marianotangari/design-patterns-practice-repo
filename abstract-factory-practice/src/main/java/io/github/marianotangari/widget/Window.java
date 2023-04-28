package io.github.marianotangari.widget;

import java.util.HashMap;
import java.util.Map;

public class Window extends Widget {

    private String borderColor;

    private static final String X_POSITION = "xPosition";
    private static final String Y_POSITION = "yPosition";

    private Map<Widget, Map<String, Double>> elements = new HashMap<>();

    public Widget setBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void addWidget(double xPosition, double yPosition, Widget widget) {

        Map<String, Double> coordinates = elements.get(widget);

        if (coordinates == null) {
            coordinates = new HashMap<>();
        }

        coordinates.put(X_POSITION, xPosition);
        coordinates.put(Y_POSITION, yPosition);
        elements.put(widget, coordinates);
    }
}
