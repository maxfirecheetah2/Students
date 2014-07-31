package com.exadel.service;

import com.exadel.entity.Skill;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public interface SkillService {

    public Integer saveSkill(Skill skill);
    public List<Skill> getSkillList();
    public void delete(Skill skill);
}
