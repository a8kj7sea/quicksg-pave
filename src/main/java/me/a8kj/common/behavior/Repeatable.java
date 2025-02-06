package me.a8kj.common.behavior;


public interface Repeatable<T> {

    /**
     * Checks if the entity's action or effect is repeatable.
     *
     * @return true if repeatable, false otherwise.
     */
    boolean isRepeatable();

    /**
     * Sets the entity's action or effect to be repeatable.
     *
     * @param repeatable true to enable repetition, false to disable.
     */
    void setRepeatable(boolean repeatable);
}
