package com.ubunifucollege.animationsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;
    Button blink, slideup, slidedown, rotate, zoomin, zoomout, crossfade, fadein, fadeout, move, bounce, sequential;
    AppCompatButton stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.imageview);
        stop =  findViewById(R.id.stop);

        blink = findViewById(R.id.blink);
        slideup = findViewById(R.id.slide_up);
        slidedown = findViewById(R.id.slide_down);
        rotate = findViewById(R.id.rotate);
        zoomin = findViewById(R.id.zoom_in);
        zoomout = findViewById(R.id.zoom_out);
        crossfade = findViewById(R.id.cross_fade);
        fadein = findViewById(R.id.fade_in);
        fadeout = findViewById(R.id.fade_out);
        move = findViewById(R.id.move);
        bounce = findViewById(R.id.bounce);
        sequential = findViewById(R.id.sequential);

        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin_animation);
                mImageView.startAnimation(animation);
            }
        });

        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomout_animation);
                mImageView.startAnimation(animation);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
                mImageView.startAnimation(animation);
            }
        });

        slidedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slidedown_animation);
                mImageView.startAnimation(animation);
            }
        });

        slideup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideup_animation);
                mImageView.startAnimation(animation);
            }
        });
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
                mImageView.startAnimation(animation);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mImageView.clearAnimation();
            }
        });
    }
}