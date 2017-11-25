package com.app.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@NoRepositoryBean
public interface BaseRepository <T,ID extends Serializable> extends JpaRepository<T,ID> {


    public T findBy(ID key);

}
