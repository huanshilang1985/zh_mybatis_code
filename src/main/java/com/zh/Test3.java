package com.zh;

import com.zh.dao.TableDetailMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: he.zhang
 * @Date: 2019/9/25 20:20
 */
public class Test3 {

    /**
     * Mybatis解析Mapper的几种方式：4种
     * 在mapper文件中可以配置： url  resource class package
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            session.getConfiguration().addMapper(TableDetailMapper.class);
            TableDetailMapper mapper = session.getMapper(TableDetailMapper.class);
            mapper.list();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
