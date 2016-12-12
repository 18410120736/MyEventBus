package com.bwie.test.myeventbus;

/**
 * Created by 123 on 2016/12/12.
 */
public class FirstEvent {


    private String name;
    public FirstEvent(String name) {
        this.name =name;
    }

    public String getMsg() {
        return name;
    }
}
