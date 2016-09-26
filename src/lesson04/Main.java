package lesson04;

import ru.javawebinar.webapp.model.Link;
import ru.javawebinar.webapp.model.Organozation;
import ru.javawebinar.webapp.model.Resume;

import java.util.HashMap;
import java.util.Map;

/**
 * user
 * 24.09.2016
 */
public class Main {
    public static void main(String[] args) {
        //new Organozation().new Period();
        new Organozation.Period();

        Map<String, Resume> map = new HashMap<>();
        map.put("uuid",new Resume("uuid","",""));

        for(String key: map.keySet()){
            System.out.println(key + "->"+map.get(key));
        }

        // эффективнее
        for(Map.Entry<String,Resume> key: map.entrySet()){
            System.out.println(key + "->"+map.get(key));

        }

    }
}
