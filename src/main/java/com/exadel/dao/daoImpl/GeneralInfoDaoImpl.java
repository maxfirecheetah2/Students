package com.exadel.dao.daoImpl;

import com.exadel.dao.GeneralInfoDao;
import com.exadel.entity.GeneralInfo;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;


/**
 * Created by Вадим on 28.07.2014.
 */
public class GeneralInfoDaoImpl extends GenericDaoImpl<GeneralInfo, Integer> implements GeneralInfoDao {

    public GeneralInfoDaoImpl() {
        super(GeneralInfo.class);
    }

    @Override
    @Transactional
    public List<Date> getAcceptionDates() {
        return (List<Date>)getCurrentSession().createQuery("select acceptionDate from GeneralInfo where billable=1" ).list();

    }

    @Override
    @Transactional
    public List<Date> getBillableDates() {
         return (List<Date>)getCurrentSession().createQuery("select billableSince from GeneralInfo where billable=1").list();
    }

    @Override
    @Transactional
    public List<Object> getFaculties() {
        return (List<Object>)getCurrentSession().createQuery("select faculty from GeneralInfo order by faculty").list();
    }

    @Override
    @Transactional
    public List<Object> getCourses() {
        return (List<Object>)getCurrentSession().createQuery("select course from GeneralInfo order by course").list();
    }

    @Override
    @Transactional
    public List<Object> getUniversities() {
        return (List<Object>)getCurrentSession().createQuery("select institution from GeneralInfo order by institution").list();
    }

    @Override
    @Transactional
    public List<Object> getBillable() {
        return (List<Object>)getCurrentSession().createQuery("select billable from GeneralInfo order by billable").list();
    }

    @Override
    @Transactional
    public List<Object> getEnglishLevels() {
        return (List<Object>)getCurrentSession().createQuery("select enLevel from GeneralInfo order by enLevel").list();
    }
}
