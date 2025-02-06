package me.a8kj.quicksg.internal.entity.arena;

import java.util.Set;

import com.google.common.collect.Sets;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.a8kj.quicksg.internal.entity.player.SGPlayer;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.entity.arena.VotedArena;

@RequiredArgsConstructor
@Getter
public class VotedArenaimpl implements VotedArena {

    private int totalVotes;
    private final Arena arena;
    private Set<SGPlayer> votedPlayers = Sets.newHashSet();

    @Override
    public void addVote(SGPlayer player) {
        if (!votedPlayers.contains(player)) {
            votedPlayers.add(player);
            totalVotes++;
        }
    }

    @Override
    public void removeVote(SGPlayer player) {
        if (votedPlayers.contains(player)) {
            votedPlayers.remove(player);
            totalVotes--;
        }
    }

    @Override
    public void clearVotes() {
        this.votedPlayers.clear();
    }
}
