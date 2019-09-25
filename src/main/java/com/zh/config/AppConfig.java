package com.zh.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Author zhanghe
 * Desc:
 * Date 2019/8/26 18:04
 */
@Configuration
@ComponentScan("com.zh")
@MapperScan("com.zh.dao")
public class AppConfig {

    /**
     * 数据源
     */
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.jdbc.Driver");
        source.setUrl("jdbc:mysql://192.168.10.1:3306/dxh_sys?characterEncoding=UTF-8");
        source.setUsername("root");
        source.setPassword("123456");
        return source;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean;
    }

}
