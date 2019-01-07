package com.example.user.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class EgService extends Service {
    boolean mAllowRebind; // indicates whether onRebind should be used
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int flags, int StartId) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Toast.makeText(this, "Service Unbind", Toast.LENGTH_LONG).show();
        // All clients have unbound with unbindService()
        //boolean mAllowRebind; // indicates whether onRebind should be used
       return mAllowRebind;

    }
    @Override
    public void onRebind(Intent intent) {
        // A client is binding to the service with bindService(),
        // after onUnbind() has already been called
        Toast.makeText(this, "Service Rebind", Toast.LENGTH_LONG).show();
    }
}
