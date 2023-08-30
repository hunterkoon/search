package com.juris.search.dao;

import java.util.List;

public interface GenericDAO<T, K> {

    void save(T entity);

    void saveAll(List<T> entitys);

    void delete(T entity);

    List<T> findAll(T entity);

    T findOne(Long id);
    T findOne(K id);

}
