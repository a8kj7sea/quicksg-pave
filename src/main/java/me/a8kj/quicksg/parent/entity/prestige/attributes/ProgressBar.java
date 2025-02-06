package me.a8kj.quicksg.parent.entity.prestige.attributes;

import me.a8kj.quicksg.parent.entity.prestige.Prestige;
import me.a8kj.quicksg.parent.entity.prestige.util.PrestigeCalculator;

/**
 * ProgressBar is an interface that represents a progress bar for tracking
 * a player's prestige progression.
 * 
 * It provides methods to visualize the current prestige level and
 * the progress toward the next prestige level.
 * 
 * @author A8kj7sea
 */
public interface ProgressBar {

    final PrestigeCalculator prestigeCalculator = new PrestigeCalculator();

    String draw(Prestige prestige, int currentStatistics);

    String getFilledChar();

    String getUnFilledChar();

    int length();
}
