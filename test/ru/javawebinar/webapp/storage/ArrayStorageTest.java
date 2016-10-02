package ru.javawebinar.webapp.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import ru.javawebinar.webapp.WebAppException;
import ru.javawebinar.webapp.model.Contact;
import ru.javawebinar.webapp.model.ContactType;
import ru.javawebinar.webapp.model.Resume;
import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * user
 * 16.09.2016
 */
public class ArrayStorageTest extends AbstractStorageTest{

    {
       storage = new ArrayStorage();
    }

//    // Блок инициализации (работает один раз )
//    static {
//        R1 = new Resume("Полное имя1","loacation");
//        R1.addContact(new Contact(ContactType.MAIL,"mail1@ya.ru"));
//        R1.addContact(new Contact(ContactType.PHONE,"111111"));
//
//        R2 = new Resume("Полное имя2","loacation");
//        R2.addContact(new Contact(ContactType.SKYPE,"skype2"));
//        R2.addContact(new Contact(ContactType.PHONE,"22222"));
//
//        R3 = new Resume("Полное имя3",null);
//        R2.addContact(new Contact(ContactType.SKYPE,"skype3"));
//        R2.addContact(new Contact(ContactType.PHONE,"33333"));
//    }

/*

    @BeforeClass
    public static void beforeClass(){
        // Тоже что и "static {}" выше

    }

    @Before
    public void before() { // Выполняется до запуска каждого тест-метода
        R1 = new Resume("Полное имя1","loacation");
        R1.addContact(new Contact(ContactType.MAIL,"mail1@ya.ru"));
        R1.addContact(new Contact(ContactType.PHONE,"111111"));

        R2 = new Resume("Полное имя2","loacation");
        R2.addContact(new Contact(ContactType.SKYPE,"skype2"));
        R2.addContact(new Contact(ContactType.PHONE,"22222"));

        R3 = new Resume("Полное имя3",null);
        R2.addContact(new Contact(ContactType.SKYPE,"skype3"));
        R2.addContact(new Contact(ContactType.PHONE,"33333"));

        storage.clear();
        storage.save(R1);
        storage.save(R2);
        storage.save(R3);


    }



    @org.junit.Test
    public void clear() throws Exception {
        storage.clear();
        assertEquals(0,storage.size());
    }

    @org.junit.Test
    public void save() throws Exception {

    }

    @org.junit.Test
    public void update() throws Exception {
        R2.setFullName("Updated №2");
        storage.update(R2);
        assertEquals(R2,storage.load(R2.getUuid()));
    }

    @org.junit.Test
    public void load() throws Exception {
        Assert.assertEquals(R1, storage.load(R1.getUuid()));
        Assert.assertEquals(R2, storage.load(R2.getUuid()));
        Assert.assertEquals(R3, storage.load(R3.getUuid()));
    }

    @org.junit.Test(expected = WebAppException.class) // Означает что тест ожидает исключение
    public void deleteNotFound(){
        storage.load("dummy");
    }

    @org.junit.Test
    public void delete() throws Exception {
        storage.delete(R1.getUuid());
        Assert.assertEquals(2, storage.size());
        //Assert.assertEquals(null,storage.load(R1.getUuid()));
        //storage.load(R1.getUuid());
    }

    @org.junit.Test
    public void getAllStored() throws Exception {
        Resume[] src = new Resume[]{R1,R2,R3};
        Arrays.sort(src);
        assertArrayEquals(src,storage.getAllStored().toArray());
    }


    @org.junit.Test
    public void size() throws Exception {
        Assert.assertEquals(3, storage.size());
    }

    @org.junit.Test
    public void CompareAllFields() throws Exception {

    }

*/

}