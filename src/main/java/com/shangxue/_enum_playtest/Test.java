package com.shangxue._enum_playtest;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/11/29 15:24
 * @Version
 */
public class Test {
//之前还play过父类子类有自动/强制转换时方法属性怎么调
    public static void main(String[] args) {

        System.out.println(MouseEventType.ON_CLICK);   // ON_CLICK

        System.out.println(MouseEventType2.ON_CLICK);   // ON_CLICK
        System.out.println(MouseEventType2.ON_CLICK.getTypeName());   //click

    }
}
