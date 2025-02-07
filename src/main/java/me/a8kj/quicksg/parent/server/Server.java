package me.a8kj.quicksg.parent.server;

import java.util.Set;

import me.a8kj.quicksg.parent.entity.arena.Arena;

public interface Server {

    Arena getMainArena();

    Set<Arena> getArenaList();

    void setMainArena(Arena arena);

    void startServerCycle();

    void serve(ServerService serverService);

    void stopServerCycle();
}
