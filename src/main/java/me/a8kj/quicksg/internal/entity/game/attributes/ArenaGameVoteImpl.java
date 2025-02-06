package me.a8kj.quicksg.internal.entity.game.attributes;

import java.util.Map;
import java.util.Comparator;

import com.google.common.collect.Maps;

import me.a8kj.quicksg.internal.entity.arena.VotedArenaimpl;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.entity.arena.VotedArena;
import me.a8kj.quicksg.parent.entity.game.atributes.ArenaGameVote;

public class ArenaGameVoteImpl implements ArenaGameVote {

    private Map<String, VotedArena> arenas = Maps.newHashMap();

    @Override
    public void addArena(String name, Arena arena) {
        VotedArena votedArena = new VotedArenaimpl(arena);
        arenas.put(name.toLowerCase(), votedArena);
    }

    @Override
    public void removeArena(String name) {
        arenas.remove(name.toLowerCase());
    }

    @Override
    public void defineArenasMap(Map<String, VotedArena> newMap) {
        arenas = newMap;
    }

    @Override
    public VotedArena getMostVotedArena() {
        return arenas.values().stream()
                .max(Comparator.comparingInt(VotedArena::getTotalVotes))
                .orElse(null);
    }

    @Override
    public Map<String, VotedArena> getArenas() {
        return arenas;
    }

    @Override
    public void clearAllVotes() {
        for (VotedArena votedArena : arenas.values()) {
            votedArena.clearVotes();
        }
    }

    @Override
    public void clearArenaVotes(String name) {
        VotedArena votedArena = arenas.get(name.toLowerCase());
        if (votedArena != null) {
            votedArena.clearVotes();
        }
    }
}
