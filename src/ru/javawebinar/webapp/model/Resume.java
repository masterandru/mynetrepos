package ru.javawebinar.webapp.model;

import java.util.*;

/**
 * user
 * 30.08.2016
 */
//public class Resume implements Comparable<Resume>{
public class Resume{

    private String uuid;
    private String fullName;
    private String location;
    private String homePage;
    private Map<ContactType, String> contacts = new EnumMap<>(ContactType.class);
    private List<Section> sections = new LinkedList<>();

    public Resume(String fullName, String location) {
        this(UUID.randomUUID().toString(),fullName,location);
    }

    public Resume(String uuid, String fullName, String location) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.location = location;
    }

    public Resume() {

    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void addContact(ContactType type, String value) {
        contacts.put(type, value);
    }

    public String getContact(ContactType type) {
        return contacts.get(type);
    }

    public String getUuid() {
        return uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public String getHomePage() {
        return homePage;
    }

/*
    public List<Contact> getContacts() {
        return contacts;
    }
*/

    public List<Section> getSections() {
        return sections;
    }

    //public void setUuid(String uuid) {
    //    this.uuid = uuid;
    //}

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Resume resume = (Resume) o;
        return uuid.equals(resume.uuid);
    }



    //@Override
    public int compareTo(Resume o) {
        return fullName.compareTo(o.fullName);
    }

/*
    private String getEmail(List<Contact> list) {
        for (Contact c : list) {
            if (c.getType() == ContactType.MAIL) {
                return c.getValue();
            }
        }
        return null;
    }
*/

}
