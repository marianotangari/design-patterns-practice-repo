package io.github.marianotangari;

public class BasicTextEditor implements TextEditor{

    private final StringBuilder stringBuilder = new StringBuilder();

    @Override
    public String getText() {
        return stringBuilder.toString();
    }

    @Override
    public void append(String str) {
        stringBuilder.append(str);
    }
}
