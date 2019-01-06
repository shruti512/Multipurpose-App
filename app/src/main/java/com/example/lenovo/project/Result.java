package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {
    TextView tt,t15;
    Button b,b1;
    RatingBar r;
    ImageView i1,i2;
    TextClock t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        r=(RatingBar)findViewById(R.id.ratingBar);


        b1=(Button)findViewById(R.id.button31);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(r.getRating());



                Toast.makeText(Result.this, s, Toast.LENGTH_SHORT).show();
            }
        });
        b=(Button)findViewById(R.id.button30);
        tt=(TextView)findViewById(R.id.textView13);
        t15=(TextView)findViewById(R.id.textView15);
       t2=(TextClock)findViewById(R.id.textClock2);


            i1=(ImageView)findViewById(R.id.imageView4);


        tt.setText("Your score is "+Quiz.score);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Result.this,Second.class);
                startActivity(i);
                finish();
            }
        });


    }
}
