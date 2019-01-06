package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Tenth extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        r1=(RadioButton)findViewById(R.id.radioButton5);
        r2=(RadioButton)findViewById(R.id.radioButton6);
        r3=(RadioButton)findViewById(R.id.radioButton7);
        r4=(RadioButton)findViewById(R.id.radioButton8);
        b27=(Button)findViewById(R.id.button27);
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r2.isChecked()){
                    ++Ninth.score;
                }
                else{
                    --Ninth.score;
                }
                Intent i=new Intent(Tenth.this,Eleventh.class);
                startActivity(i);
                finish();
            }
        });
    }
}
