package com.example.p2pmessenger;

import android.net.wifi.p2p.WifiP2pDevice;

public class PeerDevice {

    private WifiP2pDevice Device;
    private boolean AlreadyInConversation;

    public PeerDevice(WifiP2pDevice device, boolean alreadyInConversation) {
        this.Device = device;
        this.AlreadyInConversation = alreadyInConversation;
    }

    public WifiP2pDevice getDevice() {
        return this.Device;
    }

    public boolean isAlreadyInConversation() {
        return this.AlreadyInConversation;
    }
}
