package ru.javawebinar.webapp.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import ru.javawebinar.webapp.model.Contact;
import ru.javawebinar.webapp.model.ContactType;
import ru.javawebinar.webapp.model.Resume;

import static org.junit.Assert.*;

/**
 * user
 * 16.09.2016
 */
public class ArrayStorageTest {

    private static Resume R1, R2, R3;
    private ArrayStorage storage = new ArrayStorage();
    // Блок инициализации (работает один раз )
    static {
        R1 = new Resume("Полное имя1","loacation");
        R1.addContact(new Contact(ContactType.MAIL,"mail1@ya.ru"));
        R1.addContact(new Contact(ContactType.PHONE,"111111"));

        R2 = new Resume("Полное имя2","loacation");
        R2.addContact(new Contact(ContactType.SKYPE,"skype2"));
        R2.addContact(new Contact(ContactType.PHONE,"22222"));

        R3 = new Resume("Полное имя3",null);
        R2.addContact(new Contact(ContactType.SKYPE,"skype3"));
        R2.addContact(new Contact(ContactType.PHONE,"33333"));
    }

    @BeforeClass
    public static void beforeClass(){
        // Тоже что и "static {}" выше
    }

    @Before
    public void before() {
        storage.clear();
        storage.save(R1);
        storage.save(R2);
        storage.save(R3);


    }


    @org.junit.Test
    public void clear() throws Exception {

    }

    @org.junit.Test
    public void save() throws Exception {

    }

    @org.junit.Test
    public void update() throws Exception {

    }

    @org.junit.Test
    public void load() throws Exception {

    }

    @org.junit.Test
    public void delete() throws Exception {
        storage.delete(R1.getUuid());
        Assert.assertEquals(2, storage.size());
        Assert.assertEquals(null,storage.load(R1.getUuid()));

    }

    @org.junit.Test
    public void getAllStored() throws Exception {

    }

    @org.junit.Test
    public void size() throws Exception {
        Assert.assertEquals(2, storage.size());
    }

}