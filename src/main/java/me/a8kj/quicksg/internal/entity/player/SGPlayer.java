package me.a8kj.quicksg.internal.entity.player;

import lombok.Data;
import me.a8kj.quicksg.parent.entity.player.Player;
import me.a8kj.quicksg.parent.entity.player.attributes.OptionsContainer;
import me.a8kj.quicksg.parent.entity.player.attributes.PlayerRecord;
import me.a8kj.quicksg.parent.entity.player.attributes.playerkit.PlayerKit;
import me.a8kj.quicksg.parent.entity.player.enums.PlayerClock;
import me.a8kj.quicksg.parent.entity.player.enums.PlayerMode;
import me.a8kj.quicksg.parent.entity.prestige.Prestige;

@Data
public class SGPlayer implements Player {

    private PlayerRecord playerRecord;
    private OptionsContainer optionsContainer;
    private PlayerClock playerClock;

    private Prestige prestige;
    private PlayerKit playerKit;

    private PlayerMode playerMode;

    private final Player bukkitPlayer;

}
