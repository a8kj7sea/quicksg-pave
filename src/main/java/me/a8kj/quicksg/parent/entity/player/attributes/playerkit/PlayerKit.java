package me.a8kj.quicksg.parent.entity.player.attributes.playerkit;

import java.util.List;
import java.util.Optional;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.bukkit.inventory.ItemStack;

import com.google.common.collect.Lists;

import lombok.NonNull;

/**
 * 
 * PlayerKit is an abstract class implements <b>Kit</b> interface , which used
 * to represent player kit , It contains on define items functions and another
 * attributes
 * 
 * 
 * 
 * @author A8kj7sea
 * 
 */
@SerializableAs("PlayerKit")
public abstract class PlayerKit implements Kit, ConfigurationSerializable {

    /**
     * Kit's permisison
     */
    private final Optional<String> permission;
    /**
     * Kit's name
     */
    private final String name;

    /**
     * Kit's armor contents
     */
    private final List<ItemStack> armorContents = Lists.newArrayList();

    /**
     * Kit's tool contents
     */
    private final List<ItemStack> toolContents = Lists.newArrayList();

    /**
     * 
     * Constructs a new PlayerKit with given permission , name and it called a
     * define items functions
     * 
     * @param permission
     * @param name
     */
    public PlayerKit(@NonNull Optional<String> permission, @NonNull String name) {
        this.permission = permission;
        this.name = name;
        defineArmorContents(armorContents);
        defineToolContents(toolContents);
    }

    /**
     * Simple function used to define armor contents to kit by passing armorContents
     * through constructor
     * 
     * @param armorContents
     */
    public abstract void defineArmorContents(@NonNull List<ItemStack> armorContents);

    /**
     * Simple function used to define tool contents to kit by passing toolContents
     * through constructor
     * 
     * @param toolContents
     */
    public abstract void defineToolContents(@NonNull List<ItemStack> toolContents);

    /**
     * Overrided funtion return a kit permission
     * 
     * @return permission
     */
    @Override
    public Optional<String> getPermission() {
        return permission;
    }

    /**
     * Overrided funtion return a kit name
     * 
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Overrided funtion return a kit armor contents
     * 
     * @return armorContents
     */
    @Override
    public List<ItemStack> getArmorContents() {
        return armorContents;
    }

    /**
     * Overrided funtion return a kit tool contents
     * 
     * @return toolContents
     */
    @Override
    public List<ItemStack> getToolContents() {
        return toolContents;
    }

}
