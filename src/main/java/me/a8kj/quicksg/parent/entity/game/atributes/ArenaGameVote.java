package me.a8kj.quicksg.parent.entity.game.atributes;

import java.util.Map;
import lombok.SneakyThrows;
import me.a8kj.common.exception.ErrorException;
import me.a8kj.quicksg.internal.entity.player.SGPlayer;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.entity.arena.VotedArena;

public interface ArenaGameVote {

    Map<String, VotedArena> getArenas();

    void addArena(String name, Arena arena);

    void removeArena(String name);

    void defineArenasMap(Map<String, VotedArena> newMap);

    @SneakyThrows
    default void addVote(String arena, SGPlayer player) {
        VotedArena votedArena = getArenas().getOrDefault(arena.toLowerCase(), null);
        if (votedArena == null)
            throw new ErrorException(new IllegalStateException("Arena not found: " + arena));

        votedArena.addVote(player);
    }

    default void removeVote(String arena, SGPlayer player) {
        VotedArena votedArena = getArenas().get(arena.toLowerCase());
        if (votedArena != null)
            votedArena.removeVote(player);
    }

    VotedArena getMostVotedArena();

    void clearAllVotes();

    void clearArenaVotes(String name);
}
