package com.rajkumarv.behavioral.command;

public class TogglePower implements Command{
    private Television tv;

    public TogglePower(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.togglePower();
    }
}
