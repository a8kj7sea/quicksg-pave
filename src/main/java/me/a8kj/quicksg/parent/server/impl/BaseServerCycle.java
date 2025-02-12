package me.a8kj.quicksg.parent.server.impl;

import me.a8kj.quicksg.parent.server.Server;
import me.a8kj.quicksg.parent.server.ServerCycle;

public abstract class BaseServerCycle implements ServerCycle {
    protected Server<?> server;

    @Override
    public void setServer(Server<?> server) {
        this.server = server;
    }
}
