package com.shangxue._enum_playtest;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/11/29 15:21
 * @Version
 */
public enum MouseEventType2 {

    //通过括号赋值,而且必须带有一个参构造器和一个属性跟方法，否则编译出错
    //赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值；如果不赋值则不能写构造器，赋值编译也出错
    ON_CLICK("click"),
    ON_UP("up"),
    ON_FOCUS("focus");

    private final String  typeName;

    MouseEventType2(String typeName) {
        this.typeName = typeName;
    }



    public String getTypeName() {
        return typeName;
    }


}
