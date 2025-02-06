package me.a8kj.quicksg.internal.entity.game;

import me.a8kj.quicksg.parent.entity.game.Game;

public class GameFactory {

    public static Game createGame() {
        return new GameImpl(null, null);
    }

}
