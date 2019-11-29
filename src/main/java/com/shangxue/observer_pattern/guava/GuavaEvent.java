package com.shangxue.observer_pattern.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-07 15:45
 **/
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数为："+str);
    }
}
