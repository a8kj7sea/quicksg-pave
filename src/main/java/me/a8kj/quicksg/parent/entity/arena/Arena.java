package me.a8kj.quicksg.parent.entity.arena;

import java.util.List;

import org.bukkit.Location;

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

    void executeAction(ArenaAction action); // like kick or smth
}
