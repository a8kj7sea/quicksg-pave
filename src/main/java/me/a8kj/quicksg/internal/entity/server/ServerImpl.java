package me.a8kj.quicksg.internal.entity.server;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.plugin.Plugin;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.server.Server;
import me.a8kj.quicksg.parent.server.ServerCycle;
import me.a8kj.quicksg.parent.server.ServerService;
import me.a8kj.quicksg.parent.server.SetupState;

@Getter
public class ServerImpl<E extends ServerCycle> implements Server<E> {

    private Arena mainArena;
    private Map<String, Arena> arenas = new HashMap<>();
    private boolean running = false;
    private final E serverCycle;

    private final Plugin plugin;
    @Setter
    private SetupState setupState;

    public ServerImpl(E serverCycle, @NonNull Plugin plugin) {
        this.serverCycle = serverCycle;
        this.serverCycle.setServer(this);
        this.plugin = plugin;
    }

    @Override
    public Arena getMainArena() {
        return mainArena;
    }

    @Override
    public Map<String, Arena> getArenas() {
        return arenas;
    }

    @Override
    public void updateArenas(Map<String, Arena> arenas) {
        this.arenas = new HashMap<>(arenas);
    }

    @Override
    public void addArena(String name, Arena arena) {
        arenas.put(name, arena);
    }

    @Override
    public void removeArena(String name) {
        arenas.remove(name);
    }

    @Override
    public void setMainArena(Arena arena) {
        this.mainArena = arena;
    }

    @Override
    public void serve(ServerService serverService) {
        if (!running && !serverService.canServe(this)) {
            System.out.println("Server is not running. Start it first.");
            return;
        }
        System.out.println("Serving with " + serverService);
        serverService.serve(this);
    }

    @Override
    public void start() {
        if (running) {
            System.out.println("Server is already running.");
            return;
        }
        running = true;
        System.out.println("Server started successfully.");
        serverCycle.onStart();
    }

    @Override
    public void load() {
        System.out.println("Loading server resources...");
        serverCycle.onLoad();
    }

    @Override
    public void stop() {
        if (!running) {
            System.out.println("Server is already stopped.");
            return;
        }
        running = false;
        System.out.println("Server shutting down...");
        serverCycle.onStop();
    }

    @Override
    public void restart() {
        if (!running) {
            System.out.println("Server is not running, starting instead...");
            start();
            return;
        }
        System.out.println("Restarting server...");
        serverCycle.onRestart();
        stop();
        start();
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public boolean hasSetup() {
        return mainArena != null && !arenas.isEmpty();
    }

    @Override
    public E getServerCycle() {
        return serverCycle;
    }
}
