package me.a8kj.quicksg.parent.entity.arena;

import java.util.List;

import org.bukkit.Location;

import me.a8kj.quicksg.parent.entity.arena.attributes.ArenaSettings;
import me.a8kj.quicksg.parent.entity.arena.attributes.Lobby;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaStatus;

public interface Arena {

    String getName();

    default ArenaStatus getStatus() {
        return ArenaStatus.IDLE;
    }

    void setArenaStatus(ArenaStatus status);

    Lobby getLobby();

    List<Location> getSpawnLocations();

    ArenaSettings getSettings();

    default void executeAction(ArenaAction action) {
        action.execute(this);
    } // like kick or smth
}
