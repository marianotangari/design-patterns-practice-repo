package io.github.marianotangari.decorator;

import io.github.marianotangari.TextEditor;

public class CaseModifierTextEditorDecorator  extends TextEditorDecorator{

    public CaseModifierTextEditorDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String getText() {
        return convertToLowerCase(super.getText());
    }

    @Override
    public void append(String str) {
        super.append(convertToLowerCase(str));
    }

    private String convertToLowerCase(String text) {
        return text.toLowerCase();
    }
}
