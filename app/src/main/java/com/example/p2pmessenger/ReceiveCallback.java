package com.example.p2pmessenger;

import com.example.p2pmessenger.data.BaseMessage;

public interface ReceiveCallback {

    void ReceiveMessage(BaseMessage msg);

}
