package com.juris.search.dao.impl;

import com.juris.search.dao.GenericDAO;
import com.juris.search.exception.HandlerException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@Slf4j
public class GenericDAOImpl<T,K> implements GenericDAO<T,K> {

    @PersistenceContext
    private EntityManager em;

    private Class<T> cl;

    public final void setClass(final Class<T> clazzToSet) {
        this.cl = clazzToSet;
    }

    @Override
    public void save(T entity) {
        try {
            em.persist(entity);
            em.flush();
        } catch (Exception ex) {
            throw new HandlerException(ex.getMessage(), ex);
        }
    }

    @Override
    @Transactional
    public void saveAll(List<T> entitys) {
        try {
            entitys.forEach(en -> {
                em.persist(en);
                em.flush();
            });
        } catch (Exception ex) {
            throw new HandlerException(ex.getMessage(), ex);
        }

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

    @Override
    public T findOne(K pk) {
        return em.find(cl , pk);
    }
}
