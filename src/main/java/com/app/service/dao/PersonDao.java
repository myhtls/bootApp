package com.app.service.dao;

import com.app.entity.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonDao extends BaseRepository<Person,Long>{

    public List<Person> findAll();

    public Person findByName(String name);


    public List<Person> findByNameAndEmaile(String name,String emaile);
}
