package me.a8kj.quicksg.parent.entity.game.atributes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.a8kj.quicksg.parent.entity.arena.enums.ArenaNextPhase;

@RequiredArgsConstructor
@Getter
public enum GamePhase {

    LOBBY(ArenaNextPhase.START),
    INGAME(ArenaNextPhase.END),
    GAME_OVER(ArenaNextPhase.RESTART);

    private final ArenaNextPhase arenaNextPhase;

}
