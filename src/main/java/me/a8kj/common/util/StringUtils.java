package me.a8kj.common.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;
import net.md_5.bungee.api.ChatColor;

@UtilityClass
public class StringUtils {

    public static String colorize(@NonNull String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
