package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.WebAppException;
import ru.javawebinar.webapp.model.Resume;

import java.lang.reflect.Array;
import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * user
 * 15.09.2016
 */
public class ArrayStorage implements IStorage {

    private static final int LIMIT = 100;
    //protected Logger LOGGER = Logger.getLogger(getClass().getName())
    private static Logger LOGGER = Logger.getLogger(ArrayStorage.class.getName());

    private Resume[] array = new Resume[LIMIT];
    private int size = 0;

    @Override
    public void clear() {
        LOGGER.info("Delete all resumes");
        Arrays.fill(array, null);

    }

    @Override
    public void save(Resume r) {
        LOGGER.info("Save resume with uuid=" + r.getUuid());
        int idx = getIdex(r.getUuid());
//        if (idx != -1) {
//            try {
//                throw new WebAppException("Resume " + r.getUuid() + "already exist", r);
//            } catch (WebAppException e) {
//                LOGGER.log(Level.SEVERE, e.getMessage(), e);
//                throw new IllegalStateException(e); //обертка мы изначальный эксепш
//            }
//        }
        if (idx != -1) throw new WebAppException("Resume " + r.getUuid() + "already exist", r);
        array[size++] = r;

    }


    @Override
    public void update(Resume r) {
        LOGGER.info("Update resume with uuid=" + r.getUuid());
        int idx = getIdex(r.getUuid());
        if (idx != -1) throw new WebAppException("Resume " + r.getUuid() + "not exist", r);
        array[idx] = r;
    }


    @Override
    public void delete(String uuid) {
        LOGGER.info("Delete resume with uuid=" + uuid);
        int idx = getIdex(uuid);
        if (idx != -1) throw new WebAppException("Resume " + uuid + "not exist");

        int numMoved = size - idx - 1;
        if (numMoved > 0)
            System.arraycopy(array, idx + 1, array, idx, numMoved);
        array[--size] = null; // clear to let GC do its work

    }

    @Override
    public Resume load(String uuid) {
        LOGGER.info("Load resume with uuid=" + uuid);
        int idx = getIdex(uuid);
        if (idx != -1) throw new WebAppException("Resume " + uuid + "not exist");
        return array[idx];

    }


    @Override
    public Collection<Resume> getAllStored() {
        Arrays.sort(array,0,size);
        return Arrays.asList(Arrays.copyOf(array,size));
    }

    @Override
    public int size() {
        return size;
    }


    private int getIdex(String uuid) {
        for (int i = 0; i < LIMIT; i++) {
            if (array[i] != null) {
                if (array[i].getUuid().equals(uuid)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
