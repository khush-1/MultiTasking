package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Fourteen extends AppCompatActivity {
    TextView t1;
    Button b31,b32,b33,b34;
    WebView w1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);
        t1=(TextView)findViewById(R.id.textView11);
        b31=(Button)findViewById(R.id.button31);
        b32=(Button)findViewById(R.id.button32);
        b33=(Button)findViewById(R.id.button33);
        b34=(Button)findViewById(R.id.button34);
        w1=(WebView)findViewById(R.id.webView);
        t1.setText("your score is "+Ninth.score);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1="http://facebook.com/";
                w1.loadUrl(s1);
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1="http://twitter.com";
                w1.loadUrl(s1);
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1="http://netcamp.in";
                w1.loadUrl(s1);
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Fourteen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });





    }
}
