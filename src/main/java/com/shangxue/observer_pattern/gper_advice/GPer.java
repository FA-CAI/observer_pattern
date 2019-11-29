package com.shangxue.observer_pattern.gper_advice;

import java.util.Observable;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-07 10:55
 **/
public class GPer extends Observable{
    private String name="GPer生态圈";
    private static GPer gPer=null;
    private GPer(){}

    public static GPer getInstance(){
       if(null==gPer){
            gPer=new GPer();
       }
       return gPer;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName()+"在"+this.name+"上提出了问题");
        setChanged();
        notifyObservers(question);

    }
}
