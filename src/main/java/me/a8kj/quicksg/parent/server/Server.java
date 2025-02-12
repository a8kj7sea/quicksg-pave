package me.a8kj.quicksg.parent.server;

import java.util.Map;

import org.bukkit.plugin.Plugin;
import me.a8kj.quicksg.parent.entity.arena.Arena;

public interface Server<E extends ServerCycle> {

    void start();

    void load();

    void stop();

    void restart();

    boolean isRunning();

    Arena getMainArena();

    Map<String, Arena> getArenas();

    void updateArenas(Map<String, Arena> arenas);

    void addArena(String name, Arena arena);

    void removeArena(String name);

    void setMainArena(Arena arena);

    SetupState getSetupState();

    void setSetupState(SetupState setupState);

    void serve(ServerService serverService);

    default boolean hasSetup() {
        return getSetupState() == SetupState.COMPLETED;
    }

    Plugin getPlugin();

    E getServerCycle();

}
