package io.github.marianotangari.decorator;

import io.github.marianotangari.TextEditor;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64TextDecorator extends TextEditorDecorator {

    public Base64TextDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String getText() {
        return convertToBase64(super.getText());
    }

    @Override
    public void append(String str) {
        super.append(convertToBase64(str));
    }

    private String convertToBase64(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }
}
