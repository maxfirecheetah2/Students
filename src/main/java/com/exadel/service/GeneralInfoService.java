package com.exadel.service;

import com.exadel.entity.GeneralInfo;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public interface GeneralInfoService {

    public Integer saveGeneralInfo(GeneralInfo generalInfo);
    public List<GeneralInfo> getGeneralInfoList();
    public void delete(GeneralInfo generalInfo);
}
