package com.example.bill.scavengerhuntprototype;

import java.util.TimerTask;
import android.util.Log;

public class GameTimer extends TimerTask {

    private String appName;

    public GameTimer() {
        appName = "ScavengerHuntPrototype";
    }

    public void run() {
        Log.w(appName,"GameTimer run");
    }
}
