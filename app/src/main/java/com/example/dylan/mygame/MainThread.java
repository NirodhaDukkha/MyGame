package com.example.dylan.mygame;

import android.util.Log;
import android.view.SurfaceHolder;

/**
 * Created by Dylan on 3/31/2016.
 */
public class MainThread extends Thread {

    private static final String TAG = MainThread.class.getSimpleName();
    private SurfaceHolder surfaceHolder;
    private MainGamePanel mainGamePanel;
    private boolean running;

    public void setRunning(boolean running){
        this.running = running;
    }

    public MainThread(SurfaceHolder surfaceHolder, MainGamePanel mainGamePanel){
        super();
        this.surfaceHolder = surfaceHolder;
        this.mainGamePanel = mainGamePanel;
    }


    @Override
    public void run() {
        long tickCount = 0L;
        Log.d(TAG, "Starting Game Loop");
        while(running){
            tickCount++;
            //Update Game State
            //Render Screen
        }
        Log.d(TAG, "Game Loop executed " + tickCount + " times");
    }
}
