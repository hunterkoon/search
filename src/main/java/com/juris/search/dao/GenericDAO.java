package com.juris.search.dao;

import java.util.List;

public interface GenericDAO<T, K> {

    void save(T entity);

    void saveAll(List<T> entitys);

    void delete(T entity);

    T findByPk(Class<T> t, K k);

}
