package me.a8kj.quicksg.parent.entity.game.mechanic;

import me.a8kj.quicksg.parent.entity.arena.enums.ArenaNextPhase;
import me.a8kj.quicksg.parent.entity.game.atributes.GamePhase;

public interface GameMechanic {

    void apply(GameMechanic mechanic);

    boolean canApply(GamePhase phase, ArenaNextPhase nextPhase);
}
