package com.zh;

import com.zh.dao.TableDetailMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: he.zhang
 * @Date: 2019/9/25 20:19
 */
public class Test2 {

    /**
     * 直接执行Mapper
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        TableDetailMapper tableDetailMapper = context.getBean(TableDetailMapper.class);
//        context.start();

        TableDetailMapper tableDetailMapper = (TableDetailMapper) context.getBean("tableDetailMapper");
        System.out.println(tableDetailMapper.list());
    }
}
