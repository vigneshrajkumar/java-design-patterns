package com.rajkumarv.behavioral.chainOfResponsiblity;

public class Cube implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public Integer process(Integer value) {
        System.out.println("cubing " + value);
        value = value * value * value;
        return this.next == null ? value : next.process(value);
    }
}
