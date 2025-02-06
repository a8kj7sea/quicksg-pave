package me.a8kj.quicksg.internal.entity.arena.attributes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.a8kj.quicksg.parent.entity.arena.attributes.ArenaSettings;

@RequiredArgsConstructor
@Getter
public class ArenaSettingsImpl implements ArenaSettings {

    private final int minimumPlayers, maxPlayers;

}
