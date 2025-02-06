package me.a8kj.quicksg.parent.entity.game.timers;

import lombok.NonNull;
import me.a8kj.quicksg.parent.timer.SimpleTimer;
import me.a8kj.quicksg.parent.timer.TimerMode;
import me.a8kj.quicksg.parent.timer.TimerState;

public class CheckerTimer extends SimpleTimer {

    public CheckerTimer(@NonNull TimerState state, int totalDuration, TimerMode mode) {
        super(state, totalDuration, mode);
    }

}
