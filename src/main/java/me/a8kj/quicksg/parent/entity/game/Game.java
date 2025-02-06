package me.a8kj.quicksg.parent.entity.game;

import java.util.Map;
import java.util.Set;

import org.bukkit.entity.Player;

import me.a8kj.quicksg.internal.entity.player.SGPlayer;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaNextPhase;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaStatus;
import me.a8kj.quicksg.parent.entity.game.atributes.GamePhase;
import me.a8kj.quicksg.parent.entity.game.mechanic.GameMechanic;
import me.a8kj.quicksg.parent.entity.player.enums.PlayerMode;
import me.a8kj.quicksg.parent.timer.Timer;

public interface Game {

    Arena getArena();

    String getName();

    Set<SGPlayer> getPlayers();

    Map<PlayerMode, Set<SGPlayer>> getPlayersByMode();

    void addPlayer(Player player);

    void removePlayer(Player player);

    void addSpectator(Player player);

    void removeSpectator(Player player);

    int getActivePlayerCount();

    int getSpectatorCount();

    GamePhase getCurrentPhase();

    Map<String, Timer> getTimers();

    void setGamePhase(GamePhase phase);

    default void setArenaStatus(ArenaStatus status) {
        this.getArena().setArenaStatus(status);
    }

    ArenaNextPhase getArenaNextPhase();

    void setArenaNextPhase(ArenaNextPhase nextPhase);

    void announce(String message);

    boolean isGameOver();

    void applyGameMechanic(GameMechanic gameMechanic);

    void serve(GameService service); // like teleport players smth like this or update player stuff
}
