package com.example.lenovo.project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mp extends AppCompatActivity {
    Button b1,b2,b3;
    ImageView i1;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp);

    b1=(Button)findViewById(R.id.button21);
        b2=(Button)findViewById(R.id.button22);
        b3=(Button)findViewById(R.id.button23);
        i1=(ImageView)findViewById(R.id.imageView3);
        mp=MediaPlayer.create(this,R.raw.a);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w=new Intent(Mp.this,Second.class);
                startActivity(w);
                finish();
            }
        });


    }
}
