package com.exadel.service.serviceImpl;

import com.exadel.dao.GeneralInfoDao;
import com.exadel.entity.GeneralInfo;
import com.exadel.service.GeneralInfoService;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class GeneralInfoServiceImpl implements GeneralInfoService {

    private GeneralInfoDao generalInfoDao;

    public GeneralInfoDao getGeneralInfoDao() {
        return generalInfoDao;
    }

    @Override
    public Integer saveGeneralInfo(GeneralInfo generalInfo) {
        return getGeneralInfoDao().save(generalInfo);
    }

    @Override
    public List<GeneralInfo> getGeneralInfoList() {
        return getGeneralInfoDao().getAll();
    }

    @Override
    public void delete(GeneralInfo generalInfo) {
       getGeneralInfoDao().delete(generalInfo);
    }
}
