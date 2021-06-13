package com.rajkumarv.behavioral.command;

public class VolumeUp implements Command{
    private Television tv;

    public VolumeUp(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeUp();
    }
}
