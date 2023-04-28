package io.github.marianotangari;

import io.github.marianotangari.factory.MacOSWidgetFactory;
import io.github.marianotangari.factory.WidgetAbstractFactory;
import io.github.marianotangari.factory.WindowsWidgetFactory;
import io.github.marianotangari.widget.*;

public class App
{
    public static void main( String[] args ) {

        //Let's instantiate the two factories
        WidgetAbstractFactory windowsFactory = new WindowsWidgetFactory();
        WidgetAbstractFactory macOSFactory = new MacOSWidgetFactory();

        Button button = windowsFactory.createButton();
        Label label = windowsFactory.createLabel();
        Menu menu = windowsFactory.createMenu();
        Window window = windowsFactory.createWindow();

        button.setHeight(4000).setWidth(3000).setName("randomButton");
        label.setHeight(4000).setWidth(3000).setName("randomLabel");
        menu.setHeight(4000).setWidth(3000).setName("randomMenu");
        window.setHeight(4000).setWidth(3000).setName("randomWindow");

        window.addWidget(40, 50, menu);
        window.addWidget(60, 90, label);

        //Taking advantage of polymorphism: vars holding Win widgets now will hold macOS widgets!

        button = macOSFactory.createButton();
        label = macOSFactory.createLabel();
        menu = macOSFactory.createMenu();
        window = macOSFactory.createWindow();

        //Wrong mixture of Win widgets and macOS widgets in the same window...
        //Should not be allowed, but it is possible thanks to the polymorphism.
        window.addWidget(10, 20, button);
    }
}
