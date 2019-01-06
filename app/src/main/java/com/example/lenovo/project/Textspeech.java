package com.example.lenovo.project;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Textspeech extends AppCompatActivity {

    Button b1,b2;
    EditText e1;
   TextToSpeech tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textspeech);
        e1=(EditText)findViewById(R.id.editText7);
    b1=(Button)findViewById(R.id.button24);
        b2=(Button)findViewById(R.id.button25);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Textspeech.this,Second.class);
                startActivity(i);
                finish();
            }
        });

        tt=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tt.setLanguage(Locale.ENGLISH);
                tt.setSpeechRate(1.0f);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                tt.speak(s,TextToSpeech.QUEUE_FLUSH,null);
            }
        });


    }
}
