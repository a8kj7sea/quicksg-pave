package me.a8kj.quicksg.parent.entity.arena;

import java.util.Set;

import me.a8kj.quicksg.internal.entity.player.SGPlayer;

public interface VotedArena {

    Arena getArena();

    int getTotalVotes();

    Set<SGPlayer> getVotedPlayers();

    void addVote(SGPlayer player);

    void removeVote(SGPlayer player);
}
