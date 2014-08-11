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
    public List<Object> getDataColumn(String nameColumn) {
         return (List<Object>)getCurrentSession().createQuery("select "+nameColumn+" from GeneralInfo order by "+nameColumn).list();

    }

    @Override
    @Transactional
    public List<Date> getAcceptionDate() {
        return (List<Date>)getCurrentSession().createQuery("select acceptionDate from GeneralInfo " ).list();

    }

    @Override
    public List<Date> getBillableDate() {
         return (List<Date>)getCurrentSession().createQuery("select billableSince from GeneralInfo ").list();
    }
}
