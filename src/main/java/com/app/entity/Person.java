package com.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@NamedQueries({
        @NamedQuery(name = "Person.findByNameAndEmaile",query="select person from Person person where person.name=?1 and person.emaile like ?2")
})
@Table(name = "person")
public class Person implements java.io.Serializable{

    @NotNull
    @Id
    @Column(name = "id",length = 255)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name",length = 50)
    private String name;

    @Column(name = "age",length = 3)
    private int age;

    @Column(name = "emaile",length = 60)
    private String emaile;

    @Column(name = "phone",length = 15)
    private String phone;

    private int sex;


    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmaile() {
        return emaile;
    }

    public void setEmaile(String emaile) {
        this.emaile = emaile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
