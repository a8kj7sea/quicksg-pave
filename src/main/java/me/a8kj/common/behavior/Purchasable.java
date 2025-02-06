package me.a8kj.common.behavior;

import java.util.List;
import java.util.Optional;

public interface Purchasable {

    int getPrice();

    Optional<String> getDisplayName();

    Optional<List<String>> getDescription();

    boolean isAvailable();

}
