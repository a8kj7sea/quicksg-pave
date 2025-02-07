package me.a8kj.quicksg.parent.entity.game;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

import me.a8kj.quicksg.internal.entity.player.SGPlayer;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaNextPhase;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaStatus;
import me.a8kj.quicksg.parent.entity.game.atributes.ArenaGameVote;
import me.a8kj.quicksg.parent.entity.game.atributes.GamePhase;
import me.a8kj.quicksg.parent.entity.game.mechanic.GameMechanic;
import me.a8kj.quicksg.parent.entity.player.enums.PlayerMode;
import me.a8kj.quicksg.parent.timer.Timer;

public interface Game {

    Arena getArena();

    String getName();

    Set<SGPlayer> getPlayers();

    Map<UUID, SGPlayer> getPlayersById();

    Map<PlayerMode, Set<SGPlayer>> getPlayersByMode();

    void addPlayer(UUID player);

    void removePlayer(UUID player);

    void addSpectator(UUID player);

    void removeSpectator(UUID player);

    int getActivePlayerCount();

    int getSpectatorCount();

    GamePhase getCurrentPhase();

    Map<String, Timer> getTimers();

    void setGameTimers(Map<String, Timer> timers);

    void setGamePhase(GamePhase phase);

    default void setArenaStatus(ArenaStatus status) {
        this.getArena().setArenaStatus(status);
    }

    ArenaGameVote getArenaGameVote();

    ArenaNextPhase getArenaNextPhase();

    void setArenaNextPhase(ArenaNextPhase nextPhase);

    void announce(String message);

    boolean isGameOver();

    void applyGameMechanic(GameMechanic gameMechanic);

    void serve(GameService service); // like teleport players smth like this or update player stuff
}
