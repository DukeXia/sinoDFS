package com.sinosoft.dfs.service;

import com.sinosoft.dfs.dao.UseDao;
import com.sinosoft.dfs.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title: service
 * @Description: java类作用描述
 * @Author: lsh
 * @CreateDate: 2018/6/23 10:21
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements IuserService{
    @Autowired
    private UseDao useDao;

    @Override
    public void save(User user) {
        useDao.save(user);
    }

    @Override
    public User get(Long id) {
        return useDao.get(id);
    }
}
