package me.a8kj.quicksg.parent.server;

public interface ServerCycle {

    void onStart();

    void onLoad();

    void onStop();

    void onRestart();

    void setServer(Server<?> server);

}
