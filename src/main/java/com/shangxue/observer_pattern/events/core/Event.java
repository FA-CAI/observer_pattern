package com.shangxue.observer_pattern.events.core;

import java.lang.reflect.Method;

/**
 * 监听器的一种包装,标准事件源格式的定义
 * Created by Tom.
 */
public class Event {
    //事件源。事件是由谁发起的保存起来
    private Object source;
    //事件触发。要通知谁（即：如果通知？通过/想要调用〖谁〗的方法实现通知到了这个谁）
    private Object target;
    //事件触发。要做什么动作，回调（即：调用谁的〖什么/哪个方法〗）
    private Method callback;
    //事件的名称。由〖什么名字〗的方法（事件）触发别的对象的什么方法，方法名与 放到Map容器管理的
    private String trigger;
    //事件触发的时间
    private long time;

    //容器的value存 Event对象
    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }

    public Object getSource() {
        return source;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public Object getTarget() {
        return target;  //具体回调方法是〖谁〗的方法，也就是invoke的第一个参数呗
    }

    public Method getCallback() {
        return callback;
    }

    @Override
    public String toString() {
        return "Event{" + "\n" +
                "\tsource=" + source.getClass() + ",\n" +
                "\ttarget=" + target.getClass() + ",\n" +
                "\tcallback=" + callback + ",\n" +
                "\ttrigger='" + trigger + "',\n" +
                "\ttime=" + time + "'\n" +
                '}';
    }
}
