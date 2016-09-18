package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.WebAppException;
import ru.javawebinar.webapp.model.Resume;

import java.util.Collection;

/**
 * user
 * 15.09.2016
 */
public interface IStorage {
    void clear();
    void save (Resume r) throws WebAppException;
    void update (Resume r);
    Resume load (String uuid);
    void delete (String uuid);
    Collection<Resume> getAllStored();
    int size();

}
