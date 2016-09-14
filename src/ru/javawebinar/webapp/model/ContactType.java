package ru.javawebinar.webapp.model;

/**
 * user
 * 11.09.2016
 */
public enum ContactType {
    PHONE("Тел."),
    MOBILE("Мобильный"),
    HOME_PHONE("Домашний тел."),
    SKYPE("Skype"),
    MAIL("Почта"),
    ICQ("ICQ");

    private String title;

    ContactType(String title) { this.title = title; }

    public String getTitle() { return title; }
}
