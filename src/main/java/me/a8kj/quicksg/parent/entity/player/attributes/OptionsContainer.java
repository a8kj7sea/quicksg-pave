package me.a8kj.quicksg.parent.entity.player.attributes;

import java.util.Map;

import me.a8kj.quicksg.parent.entity.player.PlayerOption;



/**
 * The OptionsContainer interface represents a container for player options.
 * It allows for the management and retrieval of various PlayerOption settings
 * within a player's configuration.
 * 
 * This interface is designed to provide a structured way to access and
 * manipulate player options, facilitating customization and configuration.
 * 
 * @author A8kj7sea
 */
public interface OptionsContainer {

    /**
     * Retrieves a map of available player options/settings.
     *
     * The map keys are typically identifiers for the options (e.g., option names),
     * and the values are the corresponding PlayerOption instances representing the
     * current options.
     *
     * @return A map where the key is a String identifier and the value is a
     *         PlayerOption instance representing the current option.
     */
    Map<String, ? extends PlayerOption> getOptions();

    /**
     * Retrieves a specific PlayerOption by its identifier.
     *
     * @param key The identifier for the PlayerOption.
     * @return The PlayerOption instance associated with the key, or null if not
     *         found.
     */
    PlayerOption getOption(String key);

    /**
     * Adds default options to the container. This method can be implemented
     * by concrete classes to initialize the container with predefined options.
     *
     * @param options A map of PlayerOption instances to be added as defaults,
     *                where the key is a String identifier for the option.
     */
    default void addDefaultOptions(Map<String, PlayerOption> options) {

    }
}
