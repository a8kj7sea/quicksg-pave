package me.a8kj.quicksg.parent.entity.player.enums;

/**
 * PlayerClock is an enum to represent player time/clock in pvp
 * 
 * @author A8kj7sea
 */
public enum PlayerClock {

    /**
     * Represent a Sunset clock
     */
    SUNSET,
    /**
     * Represent a morning clock
     */
    MORNING,
    /**
     * Represent a midnight clock
     */
    MID_NIGHT;

    /**
     * Simple function search on PlayerClock by his name
     * 
     * @param name
     * @return PlayerClock
     */
    public static PlayerClock getPlayerClockByName(String name) {
        for (PlayerClock playerClock : PlayerClock.values()) {
            if (playerClock.name().equalsIgnoreCase(name))
                return playerClock;
        }
        return null;
    }
}
