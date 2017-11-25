package com.app.service;

import com.app.entity.Person;
import com.app.service.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService  {

    private @Autowired PersonDao personDao;

    public List<Person> findAll(){
        return personDao.findAll();
    }


    public Person findPersonByName(String name){
        return personDao.findByName(name);
    }

    public List<Person> findByNameAndEmaile(String name,String emaile){
        return personDao.findByNameAndEmaile(name,emaile);
    }

    public Person findPersonById(long id){
        return personDao.findBy(id);
    }

}
