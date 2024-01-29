package com.example.p2pmessenger.connection;

import com.example.p2pmessenger.data.BaseMessage;
import com.example.p2pmessenger.ReceiveCallback;

public abstract class ChatConnection {

    public static final int CHAT_PORT = 8050;

    public boolean IsConnected = false;

    protected boolean ShouldStop = false;

    protected ReceiveCallback Callback;

    protected ChatConnection(ReceiveCallback callback) {
        this.Callback = callback;
    }

    public abstract void SendMessage(BaseMessage message);

    public void Stop() {
        this.IsConnected = false;
        this.ShouldStop = true;
    }
}
