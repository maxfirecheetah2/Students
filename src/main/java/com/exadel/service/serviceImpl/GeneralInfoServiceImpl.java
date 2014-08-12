package com.exadel.service.serviceImpl;

import com.exadel.dao.GeneralInfoDao;
import com.exadel.entity.GeneralInfo;
import com.exadel.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
@Service
public class GeneralInfoServiceImpl implements GeneralInfoService {

    @Autowired
    @Qualifier("generalInfoDao")
    private GeneralInfoDao generalInfoDao;

    public GeneralInfoDao getGeneralInfoDao() {
        return generalInfoDao;
    }

    @Override
    @Transactional
    public Integer saveGeneralInfo(GeneralInfo generalInfo) {
        return getGeneralInfoDao().save(generalInfo);
    }

    @Override
    @Transactional
    public List<GeneralInfo> getGeneralInfoList() {
        return getGeneralInfoDao().getAll();
    }

    @Override
    @Transactional
    public void delete(GeneralInfo generalInfo) {
       getGeneralInfoDao().delete(generalInfo);
    }

    @Override
    @Transactional
    public void saveOrUpdate(GeneralInfo persistentObject) {
        getGeneralInfoDao().saveOrUpdate(persistentObject);
    }
}
