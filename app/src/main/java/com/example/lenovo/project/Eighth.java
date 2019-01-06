package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eighth extends AppCompatActivity {
    Button b21,b23,b24;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
      b21=(Button)findViewById(R.id.button21);
        b23=(Button)findViewById(R.id.button23);
        b24=(Button)findViewById(R.id.button24);
       b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Eighth.this,Fifteen.class);
                startActivity(i);
                //finish();
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Eighth.this,Seventh.class);
                startActivity(i);
                finish();
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Eighth.this,Ninth.class);
                startActivity(j);
                //finish();
            }
        });


    }
}
