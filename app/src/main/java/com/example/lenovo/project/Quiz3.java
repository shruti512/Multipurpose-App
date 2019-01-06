package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;

public class Quiz3 extends AppCompatActivity {
    Button b;
    TextView t;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        b=(Button)findViewById(R.id.button29);
        t=(TextView)findViewById(R.id.textView12);
        r1=(RadioButton)findViewById(R.id.radioButton9);
        r2=(RadioButton)findViewById(R.id.radioButton10);
        r3=(RadioButton)findViewById(R.id.radioButton11);
        r4=(RadioButton)findViewById(R.id.radioButton12);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!r1.isChecked()&&!r2.isChecked()&&!r3.isChecked()&&!r4.isChecked());
                else if(r3.isChecked())
                {
                    ++Quiz.score;
                }
                else
                {
                    --Quiz.score;
                }
                Intent n=new Intent(Quiz3.this,Result.class);
                startActivity(n);
                finish();
            }
        });

    }
}
