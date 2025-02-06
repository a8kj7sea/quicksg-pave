package me.a8kj.quicksg.internal.entity.game;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import lombok.Data;
import me.a8kj.common.util.StringUtils;
import me.a8kj.quicksg.internal.entity.player.SGPlayer;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaNextPhase;
import me.a8kj.quicksg.parent.entity.game.Game;
import me.a8kj.quicksg.parent.entity.game.GameService;
import me.a8kj.quicksg.parent.entity.game.atributes.ArenaGameVote;
import me.a8kj.quicksg.parent.entity.game.atributes.GamePhase;
import me.a8kj.quicksg.parent.entity.game.mechanic.GameMechanic;
import me.a8kj.quicksg.parent.entity.player.enums.PlayerMode;
import me.a8kj.quicksg.parent.timer.Timer;

@Data
public class GameImpl implements Game {

    private final Arena arena;
    private final String name;
    private final Set<SGPlayer> players = Sets.newHashSet();
    private final Map<PlayerMode, Set<SGPlayer>> playersByMode = Maps.newHashMap();

    private GamePhase currentPhase;
    private final ArenaGameVote arenaGameVote;
    private ArenaNextPhase arenaNextPhase;

    private final Map<String, Timer> timers = Maps.newHashMap();

    private final Map<UUID, SGPlayer> playersById = Maps.newHashMap();

    @Override
    public void addPlayer(UUID player) {
        SGPlayer sgPlayer = playersById.get(player);
        if (sgPlayer != null) {
            players.add(sgPlayer);
            playersByMode.computeIfAbsent(PlayerMode.PLAYING, k -> Sets.newHashSet()).add(sgPlayer);
        }
    }

    @Override
    public void removePlayer(UUID player) {
        SGPlayer sgPlayer = playersById.remove(player);
        if (sgPlayer != null) {
            players.remove(sgPlayer);
            playersByMode.getOrDefault(PlayerMode.PLAYING, Sets.newHashSet()).remove(sgPlayer);
        }
    }

    @Override
    public void addSpectator(UUID player) {
        SGPlayer sgPlayer = playersById.get(player);
        if (sgPlayer != null) {
            players.add(sgPlayer);
            playersByMode.computeIfAbsent(PlayerMode.SPECTATOR, k -> Sets.newHashSet()).add(sgPlayer);
        }
    }

    @Override
    public void removeSpectator(UUID player) {
        SGPlayer sgPlayer = playersById.remove(player);
        if (sgPlayer != null) {
            players.remove(sgPlayer);
            playersByMode.getOrDefault(PlayerMode.SPECTATOR, Sets.newHashSet()).remove(sgPlayer);
        }
    }

    @Override
    public int getActivePlayerCount() {
        return playersByMode.getOrDefault(PlayerMode.PLAYING, Sets.newHashSet()).size();
    }

    @Override
    public int getSpectatorCount() {
        return playersByMode.getOrDefault(PlayerMode.SPECTATOR, Sets.newHashSet()).size();
    }

    @Override
    public void setGamePhase(GamePhase phase) {
        this.currentPhase = phase;
    }

    @Override
    public void setArenaNextPhase(ArenaNextPhase nextPhase) {
        this.arenaNextPhase = nextPhase;
    }

    @Override
    public void announce(String message) {
        String coloredMessage = StringUtils.colorize(message);
        for (SGPlayer player : players) {

            Player activePlayer = player.getBukkitPlayer();
            if (activePlayer == null || !activePlayer.isOnline())
                continue;
            player.getBukkitPlayer().sendMessage(coloredMessage);
        }
    }

    @Override
    public boolean isGameOver() {
        return currentPhase == GamePhase.GAME_OVER;
    }

    @Override
    public void applyGameMechanic(GameMechanic gameMechanic) {
        if (gameMechanic.canApply(currentPhase, arenaNextPhase)) {
            gameMechanic.apply(this);
        }
    }

    @Override
    public void serve(GameService service) {
        if (service.canServe()) {
            service.serve(this);
        }
    }
}
