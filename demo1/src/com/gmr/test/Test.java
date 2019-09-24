package com.gmr.test;

import com.gmr.service.EatService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 通过配置文件配置实现aop
 * @Author GanMingRan
 * @Date 2019/9/24 15:25
 **/
public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        EatService service = (EatService)context.getBean("eatService");
        service.eat();
    }
}
