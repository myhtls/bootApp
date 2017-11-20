package com.app.controllers;

import com.app.entity.Person;
import com.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/persons")
public class PersonControoler {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> home(){
        return personService.findAll();
    }



    @RequestMapping(value="/{name}",method = RequestMethod.GET)
    public Person findByName(@PathVariable("name") String name){
        return personService.findPersonByName(name);
    }

    @RequestMapping(value="/{name}/{emalie}",method = RequestMethod.GET)
    public List<Person> findByNameAndEmaile(@PathVariable("name") String name,@PathVariable("emalie") String emalie){
        System.err.println(name);
        System.err.println(emalie);
        return personService.findByNameAndEmaile(name,"%"+emalie+"%");
    }



}
