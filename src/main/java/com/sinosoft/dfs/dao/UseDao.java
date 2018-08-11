package com.sinosoft.dfs.dao;

import com.sinosoft.dfs.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @Title: java类的类型
 * @Description: java类作用描述
 * @Author: lsh
 * @CreateDate: 2018/6/23 10:00
 * @Version: 1.0
 */
@Repository
public class UseDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user){
        jdbcTemplate.update("insert into t_user(name) values(?)",user.getName());
    }
    public User get(Long id){
        RowMapper<User> rowMapper= new BeanPropertyRowMapper<>(User.class);
        return jdbcTemplate.queryForObject("select * from t_user where id=?",rowMapper,id);
    }
}
