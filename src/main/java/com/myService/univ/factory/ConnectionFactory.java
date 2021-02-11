package com.myService.univ.factory;

import org.apache.ibatis.session.SqlSessionFactory;
public class ConnectionFactory {

    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

}
