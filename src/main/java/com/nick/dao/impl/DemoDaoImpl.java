package com.nick.dao.impl;

import com.nick.dao.DemoDao;
import com.nick.model.DemoEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
public class DemoDaoImpl implements DemoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<DemoEntity> getAllEntities() {
        List<DemoEntity> entities = em.createNamedQuery("DemoEntity.findAll", DemoEntity.class).getResultList();
        return entities;
    }

    @Override
    public DemoEntity getEntityById(Long id) {
        DemoEntity entity = em.find(DemoEntity.class, id);
        return entity;
    }
}
