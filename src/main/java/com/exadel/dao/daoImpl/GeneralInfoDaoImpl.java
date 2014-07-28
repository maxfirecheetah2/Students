package com.exadel.dao.daoImpl;

import com.exadel.dao.GeneralInfoDao;
import com.exadel.entity.GeneralInfo;


/**
 * Created by Вадим on 28.07.2014.
 */
public class GeneralInfoDaoImpl extends GenericDaoImpl<GeneralInfo, Integer> implements GeneralInfoDao {

    public GeneralInfoDaoImpl() {
        super(GeneralInfo.class);
    }
}
