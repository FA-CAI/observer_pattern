package com.shangxue.observer_pattern.guava;

import com.google.common.eventbus.Subscribe;
import com.shangxue.observer_pattern.gper_advice.Question;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-07 16:03
 **/
public class Teacher {
    private String name;

    public Teacher(String name){
        this.name = name;
    }

    @Subscribe
    public void updateForGuava(Question question) {
        System.out.println("==============================================================");
        System.out.println(name + "老师你好，" + "学员[ " + question.getUserName() +" ]提交了一个问题，问题内容是：" + question.getContent());
    }
}
