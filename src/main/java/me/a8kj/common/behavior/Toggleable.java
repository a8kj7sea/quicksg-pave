package me.a8kj.common.behavior;

/**
 * The Toggleable interface provides a mechanism to enable or disable options
 * within a given context. This is useful for managing feature states or
 * settings in a flexible manner.
 * 
 * @author A8kj7sea
 */
public interface Toggleable {

    /**
     * Checks whether the option is currently enabled.
     *
     * @return {@code true} if the option is enabled; {@code false} otherwise.
     */
    boolean isEnabled();

    /**
     * Sets the enabled state of the option.
     *
     * @param state {@code true} to enable the option; {@code false} to disable it.
     */
    void toggle(boolean state);
}
