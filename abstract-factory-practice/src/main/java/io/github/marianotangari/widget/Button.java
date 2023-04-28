package io.github.marianotangari.widget;

/**
 * Standard GUI Button class which allows the user to navigate to a new location
 * by clicking the button when 'link' attribute is set.
 */
public class Button extends Widget implements Clickable {

    private String link;

    @Override
    public void onClick() {
        System.out.println(String.format("Loading location: %s%n", link));
    }

    public Button setLink(String link) {
        this.link = link;
        return this;
    }

    public String getLink() {
        return link;
    }
}
