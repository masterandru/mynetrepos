package lesson02;

import ru.javawebinar.webapp.model.Link;

/**
 * user
 * 04.09.2016
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- START PROGRAMM 02 ---");

        Link link = new Link("JavaWebinar", "javawebinar.ru");

        Link link1 = link;
        Link link2 = link;
        Link link3 = new Link(link1);

        System.out.println(link);

        System.out.println(link.equals(link1));
        System.out.println(link.equals(link3));

        System.out.println(link.getClass());






    }


}
