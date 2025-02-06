package me.a8kj.quicksg.parent.entity.prestige.attributes;

/**
 * PrestigeRequirements is an interface represent a Prestige's requirements like
 * min kills and max kills
 * 
 * @author A8kj7sea
 */
public interface PrestigeRequirements {

    /**
     * Getter function return a min amount that required to start prestige
     * 
     * @return min
     */
    int getMinAmount();

    /**
     * Getter function return a max amount
     * 
     * @return max
     */
    int getMaxAmount();
}
