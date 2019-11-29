package com.shangxue.observer_pattern.events.core;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件的注册和监听
 * Created by Tom.
 */
public class EventLisenter {

    //JDK底层的Lisenter通常也是这样来设计的
    //Map相当于是一个注册器
    protected Map<String,Event> events = new HashMap<String,Event>();

    //事件名称和一个目标对象来触发事件
    public void addLisenter(String eventType,Object target){
        try {
            this.addLisenter(
                    eventType,
                    target,
                    target.getClass().getMethod("on" + toUpperFirstCase(eventType),Event.class));//这方法onClick和事件click搞两种写法是特地为了蛋疼自己吗？
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addLisenter(String eventType,Object target,Method callback){
        //注册事件 （放到Map容器里）
        events.put(eventType, new Event(target, callback));
    }


    //触发，只要有动作就触发
    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
            //发起回调
            if(event.getCallback() != null){
                //用反射调用它的回调函数
                //得到Method对象（该方法）然后该对象(方法类对象)要调用起来（入参：由谁来调它(实体类对象)，方法的本来参数(new Object[]{10,20}或就分开写)）
                event.getCallback().invoke(event.getTarget(),event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //事件名称触发。   调重载方法trigger(Event event)
    protected void trigger(String trigger){
        if(!this.events.containsKey(trigger)){return;}   //如果容器里没有这个事件（以key表示）（没注册），直接返回
        trigger(this.events.get(trigger).setTrigger(trigger));    // 这个啥意思，是 递归？-_-||不是，是重载
    }

    //逻辑处理的私有方法。效果:首字母大写
    private String toUpperFirstCase(String str){
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

}

/**
 * 【补课】
 * 反射补课invoke()
 * 使用：https://blog.csdn.net/fragrant_no1/article/details/84965028
 * https://blog.csdn.net/qq_39266910/article/details/78567116
 *
 */