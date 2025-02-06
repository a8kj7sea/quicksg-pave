package me.a8kj.quicksg.parent.entity.prestige.util;



import static java.lang.Math.ceil;

import me.a8kj.quicksg.parent.entity.prestige.Prestige;
import me.a8kj.quicksg.parent.entity.prestige.attributes.PrestigeRequirements;

public class PrestigeCalculator {

    public double calculateProgressPrecentage(int currentStatistics, Prestige currentPrestige) {
        PrestigeRequirements prestigeRequirements = currentPrestige.getRequirements();
        double progressPrecentage = currentStatistics / prestigeRequirements.getMaxAmount() * 100.0;
        return ceil(progressPrecentage);
    }

    public int calculateFilledChar(int length, int currentStatistics, Prestige currentPrestige) {
        return (int) Math.min(length, currentStatistics * length / 100);
    }

}
