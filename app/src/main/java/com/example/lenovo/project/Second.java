package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second extends AppCompatActivity {
  TextView t1,t2,t3,t4,t5,t6,t,t9,t14,t17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    t1=(TextView)findViewById(R.id.textView2);
        t2=(TextView)findViewById(R.id.textView3);
        t3=(TextView)findViewById(R.id.textView4);
        t4=(TextView)findViewById(R.id.textView5);
        t5=(TextView)findViewById(R.id.textView6);
        t6=(TextView)findViewById(R.id.textView7);
        t9=(TextView)findViewById(R.id.textView9);
        t14=(TextView)findViewById(R.id.textView14);
        t17=(TextView)findViewById(R.id.textView17);
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Second.this,Quiz.class);
                startActivity(n);
                finish();
            }
        });



        t=(TextView)findViewById(R.id.textView);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z=new Intent(Second.this,Textspeech.class);
                startActivity(z);
                finish();
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Second.this,Print.class);
                startActivity(i);
                finish();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Second.this,Searchview.class);
                startActivity(i1);
                finish();

            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Second.this,Mp.class);
                startActivity(i2);
                finish();

            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Second.this,New.class);
                startActivity(i3);
                finish();

            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Second.this,Camera.class);
                startActivity(i4);

                finish();
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(Second.this,Sms.class);
                startActivity(i5);
                finish();
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9=new Intent(Second.this,Magic.class);
                startActivity(i9);
                finish();
            }
        });

        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i17=new Intent(Second.this,Alarm.class);
                startActivity(i17);
                finish();
            }
        });


    }
}
