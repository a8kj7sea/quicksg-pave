package me.a8kj.quicksg.internal.entity.arena;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.configuration.serialization.SerializableAs;

import lombok.Data;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.entity.arena.attributes.ArenaSettings;
import me.a8kj.quicksg.parent.entity.arena.attributes.Lobby;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaStatus;

@Data
@SerializableAs("arena")
public class ArenaImpl implements Arena {

    private final String name;
    private ArenaStatus arenaStatus;
    private final Lobby lobby;
    private List<Location> spawnLocations;
    private ArenaSettings settings;

}
