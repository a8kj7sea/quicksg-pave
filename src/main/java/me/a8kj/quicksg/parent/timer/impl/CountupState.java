package me.a8kj.quicksg.parent.timer.impl;

import me.a8kj.quicksg.parent.timer.TimerState;

public class CountupState implements TimerState {
    private int elapsedTime;

    public CountupState(int initialTime) {
        this.elapsedTime = initialTime;
    }

    @Override
    public void tick() {
        elapsedTime++;
    }

    @Override
    public void reset(int newTime) {
        this.elapsedTime = newTime;
    }

    @Override
    public int getTime() {
        return elapsedTime;
    }
}
