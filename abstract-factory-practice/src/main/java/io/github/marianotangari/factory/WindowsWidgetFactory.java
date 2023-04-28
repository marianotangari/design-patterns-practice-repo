package io.github.marianotangari.factory;

import io.github.marianotangari.widget.*;

public class WindowsWidgetFactory implements WidgetAbstractFactory {

    @Override
    public Button createButton() {
        System.out.println("Creating a button the Windows way!");
        return new Button();
    }

    @Override
    public Menu createMenu() {
        System.out.println("Creating a menu the Windows way!");
        return new Menu();
    }

    @Override
    public Window createWindow() {
        System.out.println("Creating a window the Windows way!");
        return new Window();
    }

    @Override
    public Label createLabel() {
        System.out.println("Creating a label the Windows way!");
        return new Label();
    }
}
