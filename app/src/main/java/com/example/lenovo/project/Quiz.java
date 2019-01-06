package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {
    TextView t1;
    RadioButton r1,r2,r3,r4;
    Button b;
    static int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    b=(Button)findViewById(R.id.button27);
    t1=(TextView)findViewById(R.id.textView10);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=0;
                if(!r1.isChecked()&&!r2.isChecked()&&!r3.isChecked()&&!r4.isChecked())
                {
                    score=score;
                }
                else if(r1.isChecked())
                {
                    ++score;
                }
                else
                {
                    --score;
                }

                Intent i=new Intent(Quiz.this,Quiz2.class);
                startActivity(i);
                finish();
            }
        });


    }
}
