package me.a8kj.quicksg.parent.timer.impl;

import me.a8kj.quicksg.parent.timer.TimerState;

public class CountdownState implements TimerState {
    private int timeLeft;

    public CountdownState(int initialTime) {
        this.timeLeft = initialTime;
    }

    @Override
    public void tick() {
        if (timeLeft > 0) {
            timeLeft--;
        }
    }

    @Override
    public void reset(int newTime) {
        this.timeLeft = newTime;
    }

    @Override
    public int getTime() {
        return timeLeft;
    }
}
