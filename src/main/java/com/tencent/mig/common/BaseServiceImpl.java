package com.tencent.mig.common;/**
 * Created by jiajia on 2018/5/9.
 */

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author jiajia
 * @version V1.0
 * @Description: baseService
 * @date 2018/5/9 23:09
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    public abstract BaseDao<T> getDao();

    @Transactional
    @Override
    public T save(T t) {
        getDao().insert(t);
        return t;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int saveList(List<T> list) {
        return getDao().insertList(list);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int delete(Serializable id) {
        return getDao().delete(id);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int deleteAll() {
        return getDao().deleteAll();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int update(T t) {
        return getDao().update(t);
    }

    @Override
    public T get(Serializable id) {
        return getDao().get(id);
    }

    @Override
    public List<T> getAll() {
        return getDao().getAll();
    }
}
