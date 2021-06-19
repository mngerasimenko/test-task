package com.haulmont.testtask.storage;

import java.util.ArrayList;
import java.util.List;

public abstract class Storage<T> {
    List<T> storageList;

    public void addItem(T item) {
        if (storageList == null) {
            storageList = new ArrayList<T>();
        }
        storageList.add(item);
    }

    public List<T> getAll() {
        return storageList;
    }
}
