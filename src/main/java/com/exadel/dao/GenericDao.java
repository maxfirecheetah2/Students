package com.exadel.dao;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface GenericDao<T, PK extends Serializable>{

    T get(PK id);
    PK save(T persistentObject);
    List<T> getAll();
    void update(T persistentObject);
    void saveOrUpdate(T persistentObject);
    void delete(T persistentObject);



}
