package com.example.audiolibros.chido.fragments;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;


public class LocalService extends Service {
    MediaPlayer mediaPlayer;
    private final IBinder binder = new LocalBinder();
    LocalBinder localBinder;
    Context context;


    NotificationCompat.Builder notificacion;


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);




    }

    @Override
    public boolean bindService(Intent service, ServiceConnection conn, int flags) {
        return super.bindService(service, conn, flags);
    }

    public class LocalBinder extends Binder{
        LocalService getService(){
            return LocalService.this;
        }

    }


    @Override
    public IBinder onBind(Intent intent) {

        return binder;
    }


}
