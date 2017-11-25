package com.app.service.dao;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.Map;

@NoRepositoryBean
public  class BaseRepositoryImpl <T, ID extends Serializable> extends SimpleJpaRepository<T,ID>
        implements BaseRepository<T,ID>{

    private final EntityManager entityManager;


    public BaseRepositoryImpl(JpaEntityInformation<T,?>  jpaEntityInformation, EntityManager entityManager) {
        super(jpaEntityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public T findBy(ID key){
        return this.getOne(key);
    }

}
