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

    public GenericDaoImpl(Class<T> type){
        this.type = type;
    }

    protected Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public T get(PK id) {

        T object = (T)getCurrentSession().get(type,id);
        return object;

    }

    @Override
    public T load(PK id) {
        T object = (T)getCurrentSession().load(type,id);
        return object;
    }


    @Override
    public PK save(T persistentObject) {
        return (PK) getCurrentSession().save(persistentObject);
    }

    @Override
    public List<T> getAll() {
        Criteria crit = getCurrentSession().createCriteria(type);
        return crit.list();
    }

    @Override
    public void update(T persistentObject) {
        getCurrentSession().update(persistentObject);
    }

    @Override
    public void saveOrUpdate(T persistentObject) {
        getCurrentSession().saveOrUpdate(persistentObject);
    }

    @Override
    public void delete(T persistentObject) {
        getCurrentSession().delete(persistentObject);
    }

    public List<Object> getDataColumn(String nameEntity,String nameColumn){

        List<Object> data=(List<Object>)getCurrentSession().createQuery("select "+nameColumn+" from "+ nameEntity +" order by "+nameColumn).list();
        return data;

    }
}