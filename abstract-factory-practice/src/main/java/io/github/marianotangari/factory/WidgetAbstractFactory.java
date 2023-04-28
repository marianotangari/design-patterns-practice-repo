package io.github.marianotangari.factory;

import io.github.marianotangari.widget.*;

public interface WidgetAbstractFactory {

    Button createButton();
    Menu createMenu();
    Window createWindow();

    Label createLabel();
}
