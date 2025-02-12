package me.a8kj.debugging.server;

import me.a8kj.quicksg.internal.entity.server.ServerImpl;
import me.a8kj.quicksg.parent.server.Server;
import me.a8kj.quicksg.parent.server.ServerCycle;
import me.a8kj.quicksg.parent.server.impl.BaseServerCycle;

public class Main {

    public static void main(String[] args) {

        ServerCycle serverCycle = new TestServerCycle();
        Server<ServerCycle> server = new ServerImpl<>(serverCycle, null);

        server.start();

    }
}
