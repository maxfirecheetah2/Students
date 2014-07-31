package com.exadel.service.serviceImpl;

import com.exadel.dao.SkillDao;
import com.exadel.entity.Skill;
import com.exadel.service.SkillService;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class SkillServiceImpl implements SkillService {

    private SkillDao skillDao;

    public SkillDao getSkillDao(){return this.skillDao;}

    @Override
    public Integer saveSkill(Skill skill) {
        return getSkillDao().save(skill);
    }

    @Override
    public List<Skill> getSkillList() {
        return getSkillDao().getAll();
    }

    @Override
    public void delete(Skill skill) {
         getSkillDao().delete(skill);
    }
}
