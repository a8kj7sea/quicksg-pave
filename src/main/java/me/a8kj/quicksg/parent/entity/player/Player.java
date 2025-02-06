package me.a8kj.quicksg.parent.entity.player;

import me.a8kj.quicksg.parent.entity.player.attributes.OptionsContainer;
import me.a8kj.quicksg.parent.entity.player.attributes.PlayerRecord;
import me.a8kj.quicksg.parent.entity.player.attributes.playerkit.PlayerKit;
import me.a8kj.quicksg.parent.entity.player.enums.PlayerClock;
import me.a8kj.quicksg.parent.entity.prestige.Prestige;

/**
 * player interface represent a pvp player with his attributes
 * 
 * @author A8kj7sea
 */
public interface Player {

    /**
     * Simple getter function return a player Record
     * 
     * @return player record
     */
    PlayerRecord getPlayerRecord();

    /**
     * Simple getter function return a player options container
     * 
     * @return options container
     */
    OptionsContainer getOptionsContainer();

    /**
     * Simple getter function return a player clock
     * 
     * @return player clock
     */
    PlayerClock getPlayerClock();

    /**
     * Simple getter function return a player prestige
     * 
     * @return player prestige
     */
    Prestige getPrestige();

    /**
     * Simple getter function return a player kit
     * 
     * @return player kit
     */
    PlayerKit getPlayerKit();

    /**
     * Simple getter function to return a bukkit player
     * 
     * @return bukkit player
     */
    org.bukkit.entity.Player getBukkitPlayer();
}
