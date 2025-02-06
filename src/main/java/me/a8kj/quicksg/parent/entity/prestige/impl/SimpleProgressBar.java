package me.a8kj.quicksg.parent.entity.prestige.impl;

import me.a8kj.quicksg.parent.entity.prestige.Prestige;
import me.a8kj.quicksg.parent.entity.prestige.attributes.ProgressBar;

public class SimpleProgressBar implements ProgressBar {

    private final String filledChar;
    private final String unfilledChar;
    private final int length;

    public SimpleProgressBar(String filledChar, String unfilledChar, int length) {
        this.filledChar = filledChar;
        this.unfilledChar = unfilledChar;
        this.length = length;
    }

    @Override
    public String draw(Prestige prestige, int currentStatistics) {
        int progress = prestigeCalculator.calculateFilledChar(length, currentStatistics, prestige);
        StringBuilder progressBar = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (i <= progress) {
                progressBar.append(filledChar);
            } else {
                progressBar.append(unfilledChar);
            }
        }

        return progressBar.toString();
    }

    @Override
    public String getFilledChar() {
        return filledChar;
    }

    @Override
    public String getUnFilledChar() {
        return unfilledChar;
    }

    @Override
    public int length() {
        return length;
    }
}
