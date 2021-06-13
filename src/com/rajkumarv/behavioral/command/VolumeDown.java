package com.rajkumarv.behavioral.command;

public class VolumeDown implements Command{

    private Television tv;

    public VolumeDown(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDown();
    }
}
