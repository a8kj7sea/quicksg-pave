package me.a8kj.quicksg.parent.timer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class SimpleTimer implements Timer {
    private final @NonNull TimerState state;
    private final int totalDuration;

    @Setter
    private TimerMode mode;

    @Override
    public int getTimeLeft() {
        return this.getState().getTime();
    }

}
