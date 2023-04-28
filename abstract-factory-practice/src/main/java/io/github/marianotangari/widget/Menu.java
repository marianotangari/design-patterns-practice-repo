package io.github.marianotangari.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu extends Widget {

    private List<Label> labels = new ArrayList<>();

    public Menu addLabels(Label... labels) {
        this.labels.addAll(Arrays.asList(labels));
        return this;
    }
}
