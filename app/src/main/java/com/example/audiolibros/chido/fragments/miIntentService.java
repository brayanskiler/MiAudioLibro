package com.example.audiolibros.chido.fragments;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class miIntentService extends IntentService {



    public miIntentService(String name) {
        super(name);
    }

    public miIntentService() {
        super("MiIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
