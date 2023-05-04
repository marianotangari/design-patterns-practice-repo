package io.github.marianotangari.decorator;

import io.github.marianotangari.TextEditor;

public class TextEditorDecorator implements TextEditor {

    protected final TextEditor textEditor;

    @Override
    public String getText() {
        return textEditor.getText();
    }

    @Override
    public void append(String str) {
        textEditor.append(str);
    }

    public TextEditorDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
}
