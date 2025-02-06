package me.a8kj.quicksg.parent.entity.prestige;

import java.util.Optional;

import me.a8kj.quicksg.parent.entity.player.enums.PlayerStatisticsType;
import me.a8kj.quicksg.parent.entity.prestige.attributes.PrestigeRequirements;

public interface Prestige {

    PrestigeRequirements getRequirements();

    String getName();

    String getColor();

    default String getDisplayName() {
        return getColor() + getName();
    }

    PlayerStatisticsType getStatisticsType();

    Optional<Prestige> getNextPrestige();
}
