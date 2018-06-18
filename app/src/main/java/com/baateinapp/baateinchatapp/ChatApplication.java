package com.baateinapp.baateinchatapp;

import android.app.Application;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;


public class ChatApplication extends Application {
    private Socket mSocket;
    {
        try {
            mSocket = IO.socket("https://baatien.herokuapp.com/");
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
        }

    }

    public Socket getSocket() {
        return mSocket;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mSocket.connect();


    }



}
