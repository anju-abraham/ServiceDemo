package com.example.user.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //service-------------------------------------------------------------------
    public void startService(View view){
        startService(new Intent(getBaseContext(),EgService.class));
    }
    public void stopService(View view){
        stopService(new Intent(getBaseContext(),EgService.class) );
    }
//service-------------------------------------------------------------------

}
