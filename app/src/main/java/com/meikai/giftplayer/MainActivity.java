package com.meikai.giftplayer;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Button btnTest;
    GiftVideoView  giftVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frameLayout=findViewById(R.id.fl_layout);
        btnTest = findViewById(R.id.btn_start);

        giftVideoView=new GiftVideoView(getApplicationContext(),null, AlphaModel.TOP_TO_ALPHA_BOTTOM,GiftVideoView.CENTER_INSIDE);

//        giftVideoView = findViewById(R.id.gift_video_view);

        giftVideoView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        frameLayout.addView(giftVideoView);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // giftVideoView.setVideoFromSD("/data/user/0/com.meikai.giftplayer/mount_mp4/59.mp4");
                giftVideoView.setVideoFromAssets("128014400.mp4");

            }
        });


    }
}