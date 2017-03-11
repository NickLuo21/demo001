package com.nick.dao;

import com.nick.model.DemoEntity;

import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
public interface DemoDao {
    List<DemoEntity> getAllEntities();
    DemoEntity getEntityById(Long id);
}
