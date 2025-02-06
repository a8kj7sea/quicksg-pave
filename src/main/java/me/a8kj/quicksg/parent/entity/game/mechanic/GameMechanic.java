package me.a8kj.quicksg.parent.entity.game.mechanic;

import me.a8kj.quicksg.parent.entity.arena.enums.ArenaNextPhase;
import me.a8kj.quicksg.parent.entity.game.Game;
import me.a8kj.quicksg.parent.entity.game.atributes.GamePhase;

public interface GameMechanic {

    void apply(Game game);

    boolean canApply(GamePhase phase, ArenaNextPhase nextPhase);
}
