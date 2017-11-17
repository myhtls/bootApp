package com.app.service;

import com.app.entity.Person;
import com.app.service.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> findAll(){
        return personDao.findAll();
    }

}
