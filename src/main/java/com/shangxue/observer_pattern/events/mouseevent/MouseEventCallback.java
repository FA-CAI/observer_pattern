package com.shangxue.observer_pattern.events.mouseevent;

import com.shangxue.observer_pattern.events.core.Event;

/**
 * 观察者
 * 回调相应的逻辑，由自己实现
 * 回调函数
 */
public class MouseEventCallback {

    public void onClick(Event e){    //
        System.out.println("===========触发了鼠标单击事件==========" + "\n" + e);//并且换行打印e
    }

    public void onDoubleClick(Event e){
        System.out.println("===========触发了鼠标双击事件==========" + "\n" + e);
    }

    public void onUp(Event e){
        System.out.println("===========触发了鼠标弹起事件==========" + "\n" + e);
    }

    public void onDown(Event e){
        System.out.println("===========触发了鼠标按下事件==========" + "\n" + e);
    }

    public void onMove(Event e){
        System.out.println("===========触发了鼠标移动事件==========" + "\n" + e);
    }

    public void onWheel(Event e){
        System.out.println("===========触发了鼠标滚动事件==========" + "\n" + e);
    }

    public void onOver(Event e){
        System.out.println("===========触发了鼠标悬停事件==========" + "\n" + e);
    }

    public void onBlur(Event e){
        System.out.println("===========触发了鼠标失焦事件==========" + "\n" + e);
    }

    public void onFocus(Event e){
        System.out.println("===========触发了鼠标获焦事件==========" + "\n" + e);
    }

}
