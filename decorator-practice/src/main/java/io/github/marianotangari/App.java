package io.github.marianotangari;

import io.github.marianotangari.decorator.Base64TextDecorator;
import io.github.marianotangari.decorator.CaseModifierTextEditorDecorator;
import io.github.marianotangari.decorator.TextEditorDecorator;

public class App 
{
    public static void main( String[] args ) {

        TextEditorDecorator textEditorDecorator1 = new TextEditorDecorator(new BasicTextEditor());
        TextEditorDecorator textEditorDecorator2 = new CaseModifierTextEditorDecorator(new TextEditorDecorator(new BasicTextEditor()));
        TextEditorDecorator textEditorDecorator3 = new Base64TextDecorator(new TextEditorDecorator(new BasicTextEditor()));

        textEditorDecorator1.append("Hello!");
        textEditorDecorator2.append("Hello!");
        textEditorDecorator3.append("Hello!");

        System.out.println(textEditorDecorator1.getText());
        System.out.println(textEditorDecorator2.getText());
        System.out.println(textEditorDecorator3.getText());
    }
}
