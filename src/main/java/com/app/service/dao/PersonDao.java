package com.app.service.dao;

import com.app.entity.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonDao extends Repository<Person,Long>{

    public List<Person> findAll();

    public Person findByName(String name);
}
