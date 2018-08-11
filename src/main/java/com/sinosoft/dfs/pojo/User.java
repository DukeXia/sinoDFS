package com.sinosoft.dfs.pojo;

/**
 * @Title: java类的类型
 * @Description: java类作用描述
 * @Author: lsh
 * @CreateDate: 2018/6/23 10:13
 * @Version: 1.0
 */
public class User {
    private Long id;
    private String name;

    /**
     * 若无此构造方法，在dao层rowmaper的时候会报无init（）的异常
     */
    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
