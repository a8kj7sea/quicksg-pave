package me.a8kj.quicksg.parent.server;

public interface ServerCycle {

    void onStart();

    void onLoad();

    void onShutdown();

    void onRestart();

}
