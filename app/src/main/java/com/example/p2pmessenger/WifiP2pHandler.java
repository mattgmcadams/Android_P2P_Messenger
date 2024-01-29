package com.example.p2pmessenger;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Looper;

public class WifiP2pHandler {

    public WifiP2pManager Manager;
    public WifiP2pManager.Channel Channel;

    public WifiP2pHandler(Context context) {
        this.Manager = (WifiP2pManager) context.getSystemService(Context.WIFI_P2P_SERVICE);
        this.Channel = this.Manager.initialize(context, Looper.getMainLooper(), null);
    }
}
