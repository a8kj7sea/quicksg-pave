package me.a8kj.quicksg.parent.entity.player.attributes;

import java.util.EnumMap;

import lombok.SneakyThrows;
import me.a8kj.common.exception.ErrorException;
import me.a8kj.quicksg.parent.entity.player.enums.PlayerStatisticsType;

import static java.lang.Math.abs;

/**
 * PlayerRecord is an interface that represents a PvP player's statistics
 * record, providing simple methods to add, set, remove, and retrieve data
 * associated with specific statistics.
 * 
 * @author A8kj7sea
 */
public interface PlayerRecord {

    /**
     * Retrieves the player's statistics data in the form of an EnumMap.
     * 
     * @return an EnumMap containing the player's statistics by type
     */
    EnumMap<PlayerStatisticsType, Integer> getDataMap();

    /**
     * Updates the player's statistic for the given type with the specified value.
     * 
     * @param playerStatisticsType the type of statistic to update
     * @param amount               the value to set for the specified statistic
     */
    void setStatistics(PlayerStatisticsType playerStatisticsType, int amount);

    /**
     * Retrieves the player's statistic for the given type. If the statistic is not
     * found, returns the provided callback value.
     * 
     * @param playerStatisticsType the type of statistic to retrieve
     * @param callBack             the default value to return if the statistic is
     *                             not found
     * @return the value of the specified statistic, or the callback value if not
     *         present
     */
    int getStatistics(PlayerStatisticsType playerStatisticsType, int callBack);

    /**
     * Adds a positive amount to the player's statistic of the specified type.
     * If the statistic does not exist, it will be initialized with the specified
     * amount.
     * 
     * @param playerStatisticsType the type of statistic to update
     * @param toAdd                the amount to add to the statistic
     * @throws ErrorException if the playerStatisticsType is null
     */
    @SneakyThrows
    default void addStatistics(PlayerStatisticsType playerStatisticsType, int toAdd) {
        if (playerStatisticsType == null) {
            throw new ErrorException(new IllegalArgumentException(), "Couldn't find player data type!");
        }

        this.setStatistics(playerStatisticsType, getStatistics(playerStatisticsType, 0) + abs(toAdd));
    }

    /**
     * Removes a positive amount from the player's statistic of the specified type.
     * If the resulting value would be negative or zero, the statistic is set to
     * zero.
     * 
     * @param playerStatisticsType the type of statistic to update
     * @param toRemove             the amount to subtract from the statistic
     * @throws ErrorException if the playerStatisticsType is null
     */
    @SneakyThrows
    default void removeStatistics(PlayerStatisticsType playerStatisticsType, int toRemove) {
        if (playerStatisticsType == null) {
            throw new ErrorException(new IllegalArgumentException(), "Couldn't find player data type!");
        }

        int currentData = abs(getStatistics(playerStatisticsType, 0));

        if (currentData <= abs(toRemove)) {
            setStatistics(playerStatisticsType, 0);
            return;
        }
        setStatistics(playerStatisticsType, currentData - abs(toRemove));
    }
}
