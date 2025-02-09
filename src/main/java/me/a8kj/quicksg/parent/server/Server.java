package me.a8kj.quicksg.parent.server;

import java.util.Set;

import me.a8kj.quicksg.parent.entity.arena.Arena;

public interface Server {

    Arena getMainArena();

    Set<Arena> getArenaList();

    void setMainArena(Arena arena);

    void serve(ServerService serverService);

    void start();

    void stop();

    void restart();

    boolean isRunning();

    boolean hasSetup();
}
