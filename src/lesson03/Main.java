package lesson03;

import ru.javawebinar.webapp.model.Contact;
import ru.javawebinar.webapp.model.ContactType;

/**
 * user
 * 11.09.2016
 */
public class Main {
    public static void main(String[] args) {
        Contact c = new Contact(ContactType.PHONE,"123456");

        System.out.println(ContactType.PHONE);


    }

}
