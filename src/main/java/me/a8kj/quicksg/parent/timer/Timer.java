package me.a8kj.quicksg.parent.timer;

public interface Timer {

    int getTimeLeft();

    TimerState getState();

    int getTotalDuration();

    TimerMode getMode();

}
