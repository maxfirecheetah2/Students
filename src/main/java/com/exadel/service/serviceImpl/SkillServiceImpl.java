package com.exadel.service.serviceImpl;

import com.exadel.dao.SkillDao;
import com.exadel.entity.Skill;
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
public class SkillServiceImpl implements SkillService {

    @Autowired
    @Qualifier("skillDao")
    private SkillDao skillDao;

    public SkillDao getSkillDao(){return this.skillDao;}

    @Override
    @Transactional
    public Integer saveSkill(Skill skill) {
        return getSkillDao().save(skill);
    }

    @Override
    @Transactional
    public List<Skill> getSkillList() {
        return getSkillDao().getAll();
    }

    @Override
    @Transactional
    public void delete(Skill skill) {
         getSkillDao().delete(skill);
    }

    @Transactional
    @Override
    public Skill getSkill(Integer id) {
        return getSkillDao().get(id);
    }
}
