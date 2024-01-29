package com.example.p2pmessenger;

import android.app.Application;

public class P2pChatApplication extends Application {

    public WifiP2pHandler P2pHandler;

    @Override
    public void onCreate() {
        super.onCreate();
        this.P2pHandler = new WifiP2pHandler(this);
    }

}
