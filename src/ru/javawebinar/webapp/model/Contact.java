package ru.javawebinar.webapp.model;

/**
 * user
 * 09.09.2016
 */
public class Contact {
    private final String type;
    private final String value;

    public Contact(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
