package me.a8kj.debugging;

import me.a8kj.quicksg.parent.server.Server;
import me.a8kj.quicksg.parent.server.ServerService;

public class PrintMEssageServerService implements ServerService {

    @Override
    public void serve(Server<?> t) {
        System.out.println("Hello Print message service was here !");
    }

    @Override
    public boolean canServe(Server<?> t) {
        return true;
    }

}
