package com.example.seng449_exam;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.security.Provider;

public class MusicService2 extends Service {

    private MediaPlayer mp2;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        mp2.stop();
        super.onDestroy();
    }

    public MusicService2() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp2 = MediaPlayer.create(this,R.raw.song1);
        mp2.setLooping(true);
        mp2.start();

        return START_STICKY;
    }
}
