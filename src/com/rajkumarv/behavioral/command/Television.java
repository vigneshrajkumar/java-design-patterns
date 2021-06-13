package com.rajkumarv.behavioral.command;

public interface Television {
    public void togglePower();
    public void volumeUp();
    public void volumeDown();
    public int getVolume();
    public boolean getPowerState();
}
