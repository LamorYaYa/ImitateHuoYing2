package com.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * @author master
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void doSoundOff(View view) {
        VideoLiveWallpaper.voiceNormal(this);
    }

    public void doSoundOn(View view) {
        VideoLiveWallpaper.voiceSilence(this);
    }

    public void doStart(View view) {
        VideoLiveWallpaper.setToWallpaper(this);
    }


}
