package com.gmr.service;

import org.springframework.stereotype.Component;

/**
 * @Description 核心功能（切点）
 * @Author GanMingRan
 * @Date 2019/9/24 15:08
 **/
@Component("eatService")
public class EatService {

    public void eat(){
        System.out.println("吃饭ing。。。");
    }
}
