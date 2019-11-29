package com.shangxue.observer_pattern.gper_advice;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-07 11:01
 **/
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer=(GPer)o;
        Question question=(Question) arg;
        System.out.println("=======================");
        System.out.println(name+"您好，您收到了一个来自"+gPer.getName()+"的提问 \n"+"问题内容如下："+question.getContent());

    }
}
