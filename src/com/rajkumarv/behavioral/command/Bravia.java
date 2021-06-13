package com.rajkumarv.behavioral.command;

public class Bravia implements Television{
    private boolean poweredOn;
    private int volume;

    public Bravia() {
        this.poweredOn = false;
        this.volume = 2;
    }

    @Override
    public void togglePower() {
        poweredOn = !poweredOn;
    }

    @Override
    public void volumeUp() {
        if (volume == 5)
            return;
        volume++;
    }

    @Override
    public void volumeDown() {
        if (volume == 0)
            return;
        volume--;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public boolean getPowerState() {
        return poweredOn;
    }

    @Override
    public String toString() {
        return "Bravia{" +
                "poweredOn=" + poweredOn +
                ", volume=" + volume +
                '}';
    }
}
