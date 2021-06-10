package com.rajkumarv.behavioral.chainOfResponsiblity;

public interface Handler {
    public void setNext(Handler handler);
    public Integer process(Integer value);
}
