package com.example.lenovo.project;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Alarm extends AppCompatActivity {
    ImageButton im;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        im=(ImageButton)findViewById(R.id.imageButton2);
        b=(Button)findViewById(R.id.button32);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Alarm.this,Second.class);
                startActivity(i);
                finish();
            }
        });

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(AlarmClock.ACTION_SET_ALARM);
                i1.putExtra(AlarmClock.EXTRA_HOUR,10);
                i1.putExtra(AlarmClock.EXTRA_MINUTES,20);
                startActivity(i1);

            }
        });
    }
}
