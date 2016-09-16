package lesson03;

import ru.javawebinar.webapp.model.Link;
import ru.javawebinar.webapp.model.Resume;

import java.util.Arrays;

/**
 * user
 * 14.09.2016
 */
public class MainArray {
    public static void main(String[] args) {
        int [] array = new int[10]; // Больше поменять размерность не можем
        System.out.println(array.length);
        System.out.println(array.getClass());

        Resume[] resumes = new Resume[10]; // Больше поменять размерность не можем
        System.out.println(resumes.length);
        System.out.println(resumes.getClass());


//        Link l = new Link();
//        ((Object[]) resumes)[0]=l;

        System.out.println(Arrays.toString(array));

    }



}
