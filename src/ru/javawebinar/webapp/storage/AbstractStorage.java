package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.WebAppException;
import ru.javawebinar.webapp.model.Resume;

import java.util.logging.Logger;

/**
 * user
 * 20.09.2016
 */
abstract public class AbstractStorage implements IStorage{
    protected Logger logger = Logger.getLogger(ArrayStorage.class.getName());

    @Override
    public void save(Resume r) {
        logger.info("Save resume with uuid=" + r.getUuid());
        // TODO try to move here exception
        //doSave(r);
        doSave(r);

    }

    protected abstract void doSave(Resume r);


}
