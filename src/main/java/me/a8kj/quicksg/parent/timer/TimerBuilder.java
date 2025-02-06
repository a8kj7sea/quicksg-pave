package me.a8kj.quicksg.parent.timer;

import me.a8kj.common.service.Builder;

public class TimerBuilder implements Builder<Timer> {
    private TimerState timerState;
    private int totalTime;
    private TimerMode mode;

    public TimerBuilder withTimerState(TimerState timerState) {
        this.timerState = timerState;
        return this;
    }

    public TimerBuilder withTotalTime(int totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    public TimerBuilder withMode(TimerMode mode) {
        this.mode = mode;
        return this;
    }

    @Override
    public Timer build() {
        if (timerState == null) {
            throw new IllegalStateException("TimerState must be provided.");
        }
        return new SimpleTimer(timerState, totalTime, mode);
    }
}
