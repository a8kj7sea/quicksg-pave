package me.a8kj.debugging.server;

import me.a8kj.debugging.PrintMEssageServerService;
import me.a8kj.quicksg.parent.server.impl.BaseServerCycle;

public class TestServerCycle extends BaseServerCycle {

    @Override
    public void onStart() {
       System.err.println("Am working btw and after 3s am gonna do service");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       this.server.serve(new PrintMEssageServerService());
    }

    @Override
    public void onLoad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onLoad'");
    }

    @Override
    public void onStop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onStop'");
    }

    @Override
    public void onRestart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onRestart'");
    }
    
}
