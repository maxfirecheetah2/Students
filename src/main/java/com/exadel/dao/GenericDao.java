package com.exadel.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable>{

    T get(PK id);
    PK create(T persistentObject);
    List<T> getAll();
    void update(T persistentObject);
    void createOrUpdate(T persistentObject);
    void delete(T persistentObject);



}
