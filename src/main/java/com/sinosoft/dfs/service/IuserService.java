package com.sinosoft.dfs.service;

import com.sinosoft.dfs.pojo.User;

/**
 * @Title: java类的类型
 * @Description: java类作用描述
 * @Author: lsh
 * @CreateDate: 2018/6/23 10:20
 * @Version: 1.0
 */
public interface IuserService {
    void save(User user);
    User get(Long id);
}
