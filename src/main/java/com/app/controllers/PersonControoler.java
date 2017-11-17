package com.app.controllers;

import com.app.entity.Person;
import com.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class PersonControoler {

    @Autowired
    private PersonService personService;

    @RequestMapping
    public List<Person> home(){
        return personService.findAll();
    }
}
