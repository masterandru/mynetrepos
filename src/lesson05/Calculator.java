package lesson05;

import ru.javawebinar.webapp.model.Resume;

import java.util.Comparator;

/**
 * user
 * 27.09.2016
 */
public class Calculator {
    public int abs(int value) {
        return Math.abs(value);

    }

    public static void main(String[] args) {
        System.out.println(new Comparator<Resume>() {
            @Override
            public int compare(Resume o1, Resume o2) {
                System.out.println(this.getClass().getSimpleName());
                return 0;
            }
        });

    }


}
