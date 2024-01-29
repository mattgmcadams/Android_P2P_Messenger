package com.example.p2pmessenger.data;

import com.example.p2pmessenger.ClientInfo;

public class JoinMessage extends BaseMessage {

    private ClientInfo Client;

    public JoinMessage(ClientInfo clientInfo) {
        this.Client = clientInfo;
    }

    public ClientInfo getClient() {
        return this.Client;
    }

    public String serialize() {
        return "JOIN" + this.Client.serialize();
    }

    public static JoinMessage Deserialize(String serialized) {
        ClientInfo clientInfo = ClientInfo.Deserialize(serialized);
        return new JoinMessage(clientInfo);
    }
}
