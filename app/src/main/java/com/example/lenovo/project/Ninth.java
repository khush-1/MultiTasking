package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Ninth extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b26;
    static  int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        b26=(Button)findViewById(R.id.button26);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=0;
                if(r1.isChecked()){
                    ++score;
                }
                else{
                    --score;
                }
                Intent j=new Intent(Ninth.this,Tenth.class);
                startActivity(j);
                finish();

            }


        });

    }
}
