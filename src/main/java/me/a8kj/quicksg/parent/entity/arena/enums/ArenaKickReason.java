package me.a8kj.quicksg.parent.entity.arena.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ArenaKickReason {
    GAME_STARTED("You were kicked because the game has already started."),
    GAME_FULL("You were kicked because the game is full."),
    GAME_RESTARTING("You were kicked because the game is restarting.");

    private final String message;

}