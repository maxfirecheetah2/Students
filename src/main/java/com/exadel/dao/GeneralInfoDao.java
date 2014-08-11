package com.exadel.dao;

import com.exadel.entity.GeneralInfo;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

/**
 * Created by Вадим on 28.07.2014.
 */
@Repository
public interface GeneralInfoDao extends GenericDao<GeneralInfo, Integer> {

      public List<Object> getDataColumn( String nameColumn);
      public List<Date> getAcceptionDate();
      public List<Date> getBillableDate();
}
