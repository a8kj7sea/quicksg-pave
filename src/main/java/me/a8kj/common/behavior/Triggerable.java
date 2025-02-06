package me.a8kj.common.behavior;

import lombok.NonNull;

public interface Triggerable<T> {

    /**
     * Triggers the effect with a specified target.
     *
     * @param target The target of the effect.
     */
    void trigger(@NonNull T target);

    T getTarget();

}