package com.nick.service.impl;

import com.nick.dao.DemoDao;
import com.nick.model.DemoEntity;
import com.nick.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public List<DemoEntity> getAllEntities() {
        List<DemoEntity> entities = demoDao.getAllEntities();
        return entities;
    }

    @Override
    public DemoEntity getEntityById(Long id) {
        DemoEntity entity = demoDao.getEntityById(id);
        return entity;
    }
}
