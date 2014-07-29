package com.exadel.dao.daoImpl;

import com.exadel.dao.SkillDao;
import com.exadel.entity.Skill;

/**
 * Created by Вадим on 28.07.2014.
 */
public class SkillDaoImpl extends GenericDaoImpl<Skill, Integer> implements SkillDao {
    public SkillDaoImpl() {
        super(Skill.class);
    }
}
