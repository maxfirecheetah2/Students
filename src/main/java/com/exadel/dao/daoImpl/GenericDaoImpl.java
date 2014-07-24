package com.exadel.dao.daoImpl;

import com.exadel.dao.GenericDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;
import java.util.List;

public class GenericDaoImpl <T, PK extends Serializable> implements GenericDao <T, PK> {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    private Class<T> type;

    protected Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public GenericDaoImpl(Class<T> type){
        this.type = type;
    }

    @Override
    public T get(PK id) {
        return null;  //TODO:
    }

    @Override
    public PK create(T persistentObject) {
        return (PK) getCurrentSession().save(persistentObject);
    }

    @Override
    public List<T> getAll() {
        Criteria crit = getCurrentSession().createCriteria(type);
        return crit.list();
    }

    @Override
    public void update(T persistentObject) {
         getCurrentSession().delete(persistentObject);
    }

    @Override
    public void createOrUpdate(T persistentObject) {
          //TODO:
    }

    @Override
    public void delete(T persistentObject) {
        getCurrentSession().delete(persistentObject);
    }
}
