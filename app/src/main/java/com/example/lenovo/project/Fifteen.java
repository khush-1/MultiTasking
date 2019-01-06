package com.example.lenovo.project;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Fifteen extends AppCompatActivity implements SensorEventListener{
    SensorManager sm;
    Sensor s;
    TextView t1,t2,t3;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);
        t1=(TextView)findViewById(R.id.textView12) ;
        t2=(TextView)findViewById(R.id.textView13) ;
        t3=(TextView)findViewById(R.id.textView14) ;
        mp=MediaPlayer.create(this,R.raw.a1);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_GRAVITY);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        mp.start();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
       if(event.values[1]>5)
       {
           mp.pause();
       }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
