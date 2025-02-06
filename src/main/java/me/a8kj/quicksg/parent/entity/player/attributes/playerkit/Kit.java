package me.a8kj.quicksg.parent.entity.player.attributes.playerkit;

import java.util.List;
import java.util.Optional;

import org.bukkit.inventory.ItemStack;

/**
 * 
 * Simple kit interface represent a Player kit with his attributes
 * 
 * @author A8kj7sea
 */
public interface Kit {

    /**
     * Simple getter function return a kit permission if exist
     * 
     * @return Optional<String>
     */
    Optional<String> getPermission();

    /**
     * Simple getter function return a kit name
     * 
     * @return kit's name
     */
    String getName();

    /**
     * Simple getter function return a kit display name
     * 
     * @return kit's display name
     */
    String getDisplayName();

    /**
     * Simple getter function return a kit armors
     * 
     * @return kit's armors
     */
    List<ItemStack> getArmorContents();

    /**
     * Simple getter function return a kit tools
     * 
     * @return kit's tools
     */
    List<ItemStack> getToolContents();

}
