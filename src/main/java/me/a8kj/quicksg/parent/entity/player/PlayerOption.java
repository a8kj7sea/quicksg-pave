package me.a8kj.quicksg.parent.entity.player;

import me.a8kj.common.behavior.Toggleable;

/**
 * The PlayerOption class serves as an abstract base class for creating
 * various player options that can be toggled on or off. This class
 * implements the Toggleable interface, providing a foundation for
 * managing option states in player settings.
 * 
 * @author A8kj7sea
 */
public abstract class PlayerOption implements Toggleable {

    protected boolean enabled;

    /**
     * Checks whether this option is currently enabled.
     *
     * @return {@code true} if the option is enabled; {@code false} otherwise.
     */
    @Override
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the enabled state of this option.
     *
     * @param state {@code true} to enable the option; {@code false} to disable it.
     */
    @Override
    public void toggle(boolean state) {
        this.enabled = state;
    }
}
