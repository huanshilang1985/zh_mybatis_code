package com.zh;

import com.zh.config.AppConfig;
import com.zh.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author zhanghe
 * Desc:
 * Date 2019/8/26 18:27
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IndexService bean = context.getBean(IndexService.class);
        System.out.println(bean.list());
    }
}
