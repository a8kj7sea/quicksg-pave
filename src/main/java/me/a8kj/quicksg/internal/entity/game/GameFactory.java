package me.a8kj.quicksg.internal.entity.game;

import java.util.HashMap;
import java.util.Map;

import lombok.SneakyThrows;
import me.a8kj.common.exception.ErrorException;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaNextPhase;
import me.a8kj.quicksg.parent.entity.game.Game;
import me.a8kj.quicksg.parent.entity.game.atributes.ArenaGameVote;
import me.a8kj.quicksg.parent.entity.game.atributes.GamePhase;
import me.a8kj.quicksg.parent.timer.Timer;

public class GameFactory {

    @SneakyThrows
    public static Game createGame(String name, Arena arena, Map<String, Timer> timers,
            ArenaGameVote arenaGameVote, GamePhase phase, ArenaNextPhase arenaNextPhase) {

        if (name == null || arena == null || timers == null || arenaGameVote == null || phase == null
                || arenaNextPhase == null) {
            throw new ErrorException(new IllegalArgumentException("Game parameters cannot be null."));
        }

        Game game = new GameImpl(arena, name, arenaGameVote);
        game.setGamePhase(phase);
        game.setArenaNextPhase(arenaNextPhase);
        game.setGameTimers(new HashMap<>(timers));

        return game;
    }
}
