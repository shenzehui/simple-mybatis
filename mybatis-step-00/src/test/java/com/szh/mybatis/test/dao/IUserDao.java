package com.szh.mybatis.test.dao;

/**
 * Created by szh on 2023-06-11
 *
 * @author szh
 */

public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);
}
