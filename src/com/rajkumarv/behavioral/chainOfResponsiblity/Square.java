package com.rajkumarv.behavioral.chainOfResponsiblity;

public class Square implements Handler{

    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public Integer process(Integer value) {
        System.out.println("squaring: " + value);
        value = value * value;
        return this.next == null ? value : next.process(value);
    }
}
