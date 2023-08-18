package com.juris.search.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GenericDAO<T>{

    void save(T entity);

    void delete(T entity);

    List<T> findAll(T entity);

    T findOne(Long id);

}
