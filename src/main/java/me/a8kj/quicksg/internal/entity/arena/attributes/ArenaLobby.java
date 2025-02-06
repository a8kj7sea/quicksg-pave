package me.a8kj.quicksg.internal.entity.arena.attributes;

import org.bukkit.Location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.a8kj.quicksg.parent.entity.arena.attributes.Lobby;

@Getter
@Setter
@AllArgsConstructor
public class ArenaLobby implements Lobby {

    private Location spawnLocation;

}
