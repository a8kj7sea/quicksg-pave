package me.a8kj.quicksg.parent.entity.player.attributes.impl;

import java.util.HashMap;
import java.util.Map;

import me.a8kj.quicksg.parent.entity.player.PlayerOption;
import me.a8kj.quicksg.parent.entity.player.attributes.OptionsContainer;
import me.a8kj.quicksg.parent.entity.player.options.BoardVisibilityOption;
import me.a8kj.quicksg.parent.entity.player.options.ScrambleOption;
import me.a8kj.quicksg.parent.entity.player.options.ToggleRankOption;



/**
 * PlayerOptionsContainer is a concrete implementation of the OptionsContainer
 * interface, managing a collection of PlayerOption instances.
 * 
 * It provides methods to add, remove, and retrieve player options.
 * 
 * @author A8kj7sea
 */
public class PlayerOptionsContainer implements OptionsContainer {

    private final Map<String, PlayerOption> options;

    /**
     * Constructor to initialize the options map.
     */
    public PlayerOptionsContainer() {
        this.options = new HashMap<>();
        addDefaultOptions(options); // Add default options upon initialization
    }

    /**
     * Adds a PlayerOption to the container.
     *
     * @param key    The identifier for the PlayerOption.
     * @param option The PlayerOption to be added.
     */
    public void addOption(String key, PlayerOption option) {
        options.put(key, option);
    }

    /**
     * Retrieves a specific PlayerOption by its identifier.
     *
     * @param key The identifier for the PlayerOption.
     * @return The PlayerOption instance associated with the key, or null if not
     *         found.
     */
    @Override
    public PlayerOption getOption(String key) {
        return options.get(key);
    }

    /**
     * Removes a PlayerOption from the container.
     *
     * @param key The identifier for the PlayerOption to be removed.
     * @return {@code true} if the option was successfully removed; {@code false}
     *         otherwise.
     */
    public boolean removeOption(String key) {
        return options.remove(key) != null;
    }

    /**
     * Retrieves the map of PlayerOptions.
     *
     * @return A map of player options/settings, where keys are identifiers and
     *         values are PlayerOption instances.
     */
    @Override
    public Map<String, PlayerOption> getOptions() {
        return options;
    }

    /**
     * Adds default options to the container.
     *
     * @param options A map of PlayerOption instances to be added as defaults.
     */
    @Override
    public void addDefaultOptions(Map<String, PlayerOption> options) {
        options.put("boardVisibility", new BoardVisibilityOption());
        options.put("scramble", new ScrambleOption());
        options.put("toggleRank", new ToggleRankOption());
    }

}
