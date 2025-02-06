package me.a8kj.quicksg.internal.entity.arena.actions;

import org.bukkit.entity.Player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.a8kj.quicksg.parent.entity.arena.Arena;
import me.a8kj.quicksg.parent.entity.arena.ArenaAction;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaKickReason;

@RequiredArgsConstructor
@Getter
public class ArenaKickAction implements ArenaAction {

    private final Arena arena;
    private final Player player;
    private final ArenaKickReason kickReason;

    @Override
    public void execute(Arena arena) {
        player.kickPlayer(arena.getName() + " says: " + kickReason.getMessage());
    }
}
