package io.github.marianotangari.widget;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple Window element which can hold a list of widget inside it.
 * You can also set the window's border color.
 */
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

    /**
     * This method adds a Widget to the window. The added widget will be display as an element on the window
     * when the window is rendered. You should also set the x and y coordinates for the Widget to
     * be inserted on the window layout.
     * @param xPosition x coordinate
     * @param yPosition y coordinate
     * @param widget any subclass of Widget
     */
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
