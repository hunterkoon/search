package com.juris.search.dao.impl;

import com.juris.search.dao.GenericDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class GenericDAOImpl<T> implements GenericDAO<T> {

    @PersistenceContext
    private EntityManager em;

    private Class<T> cl;

    public final void setClass(final Class<T> clazzToSet) {
        this.cl = clazzToSet;
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public void delete(T entity) {
        em.remove(entity);
    }

    @Override
    public List<T> findAll(T entity) {
        return (List<T>) em.createQuery("FROM" + cl.getName())
                .getResultList();
    }

    @Override
    public T findOne(Long id) {
        return em.find(cl, id);
    }
}