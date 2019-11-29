package com.shangxue.observer_pattern.events;

import com.shangxue.observer_pattern.events.mouseevent.MouseEventCallback;
import com.shangxue.observer_pattern.events.mouseevent.Mouse;
import com.shangxue.observer_pattern.events.mouseevent.MouseEventType;

public class EventLisenterTest {
    public static void main(String[] args) {
        //鼠标回调函数类
    //    MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();


        //注册事件(把方法名和事件Event对象放到Map对象)。在该方法名的方法（事件）以后若被调用，则触发其他对象的回调方法(监听者)
     //   mouse.addLisenter(MouseEventType.ON_CLICK,callback);
     //   mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        //被监听的对象调用了方法（事件）
        mouse.click();
     //   mouse.focus();
    }
}

/**
 *观察者和被观察者之间没有必然联系
 * 注册的时候，才产生联系
 *
 *提高：用到“动态代理”
 */