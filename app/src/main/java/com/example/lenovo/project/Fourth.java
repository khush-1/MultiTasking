package com.example.lenovo.project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Fourth extends AppCompatActivity {
    Button b11,b12;
    MediaPlayer mp1,mp2,mp3,mp,mp4,mp5,mp6,mp7;
    Spinner dropdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        dropdown=(Spinner)findViewById(R.id.spinner);
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(Fourth.this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.names));
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        mp1=MediaPlayer.create(this,R.raw.a);
        mp2=MediaPlayer.create(this,R.raw.a1);
        mp3=MediaPlayer.create(this,R.raw.a2);
        mp4=MediaPlayer.create(this,R.raw.a3);
        mp5=MediaPlayer.create(this,R.raw.a5);
        mp6=MediaPlayer.create(this,R.raw.a6);
        mp7=MediaPlayer.create(this,R.raw.ab);
        mp=mp1;
        mp.start();
       b11.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(dropdown.getSelectedItem().equals("blankspace")){
                   mp.pause();
                   mp.start();
                   mp=mp3;
               }
               if(dropdown.getSelectedItem().equals("aedilhaimushkil")){
                   mp.pause();
                   mp2.start();
                  mp=mp2;
               }
               if(dropdown.getSelectedItem().equals("alone")){
                   mp.pause();
                   mp4.start();
                  mp=mp4;
               }
               if(dropdown.getSelectedItem().equals("loseyourself")){
                  mp.pause();
                   mp5.start();
                   mp=mp5;
               }
               if(dropdown.getSelectedItem().equals("despascito")){
                   mp.pause();
                   mp6.start();
                 mp=mp6;
               }
               if(dropdown.getSelectedItem().equals("jiyeinkyun")){
                  mp.pause();
                   mp1.start();
                   mp=mp1;
               }
               if(dropdown.getSelectedItem().equals("marathi")){
                   mp.pause();
                   mp7.start();
                   mp=mp7;
               }
           }

       });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mp.pause();
            }
        });

    }
}
