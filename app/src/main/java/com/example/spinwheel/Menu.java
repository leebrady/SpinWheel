package com.example.spinwheel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        configureSpinWheel();
        configureNearMe();
        configureNewsFeed();
    }
    private void configureSpinWheel() {
        Button SpinWheel = findViewById(R.id.SpinWheel);
        SpinWheel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, MainActivity.class));
            }
        });
    }
    private void configureNearMe() {
        Button NearMe = findViewById(R.id.NearMe);
        NearMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, NearMe.class));
            }
        });
    }

    private void configureNewsFeed() {
        Button NewsFeed = findViewById(R.id.NewsFeed);
        NewsFeed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, MainActivity1.class));
            }
        });
    }
}

