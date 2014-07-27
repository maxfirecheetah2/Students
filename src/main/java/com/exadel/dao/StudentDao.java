package com.exadel.dao;

import com.exadel.entity.Student;
import com.exadel.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends GenericDao<Student, Integer>  {
}
