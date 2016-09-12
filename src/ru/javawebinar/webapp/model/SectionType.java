package ru.javawebinar.webapp.model;

/**
 * user
 * 11.09.2016
 */
public enum SectionType {
    OBJECTIVE("Позиция"),
    ACHIVMENT("Достижения"),
    QUALIFICATION("Квалификация"),
    EXPERIENCE("Опыт работы"),
    EDUCATION("Образование");

    private String title;

    SectionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
