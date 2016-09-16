package lesson03;

import ru.javawebinar.webapp.model.Contact;
import ru.javawebinar.webapp.model.ContactType;
import ru.javawebinar.webapp.model.Link;

import java.lang.reflect.Field;

/**
 * user
 * 11.09.2016
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Contact c = new Contact(ContactType.PHONE, "123456");

        System.out.println(ContactType.PHONE);

        // через "отражение"
        Field f = Link.class.getDeclaredField("url");
        Link l = new Link("rewrw", "URL");
        f.setAccessible(true); // делаем поле доступным
        System.out.println(f.get(l));
        System.out.println();
        System.out.println(l);

        String a1 = "Ja" + "va";
        String a2 = "Java";
        System.out.println(a1 == a2);

        // Пример конкотенации строк в цикле
//        String fill = "";
//        for (int i = 0; i < 1000; i++) {
//            fill += "a";
//        }
        //System.out.println(fill);

        StringBuilder fill = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            fill.append("a");
        }

        System.out.println("l is Link? "+Link.class.isInstance(l));



    }

}
