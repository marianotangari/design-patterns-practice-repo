package io.github.marianotangari.factory;

import io.github.marianotangari.widget.Widget;

public interface WidgetAbstractFactory {

    Widget createButton();
    Widget createIcon();
    Widget createMenu();
    Widget createWindow();
}
