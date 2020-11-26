package com.example.gridlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view) {

        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        //name of mp3 file must match the button id for this to work
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.gridlayoutdemo");

        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();

        Log.i("button tapped", ourId);

    }


}