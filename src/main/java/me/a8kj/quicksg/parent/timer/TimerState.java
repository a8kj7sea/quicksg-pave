package me.a8kj.quicksg.parent.timer;

public interface TimerState {
    void tick();

    void reset(int newTime);

    int getTime();
}
