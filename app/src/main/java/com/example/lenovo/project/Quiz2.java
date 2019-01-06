package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz2 extends AppCompatActivity {
    Button b;
    TextView t;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        b=(Button)findViewById(R.id.button28);
        t=(TextView)findViewById(R.id.textView11);
        r1=(RadioButton)findViewById(R.id.radioButton5);
        r2=(RadioButton)findViewById(R.id.radioButton6);
        r3=(RadioButton)findViewById(R.id.radioButton7);
        r4=(RadioButton)findViewById(R.id.radioButton8);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!r1.isChecked()&&!r2.isChecked()&&!r3.isChecked()&&!r4.isChecked())
                {

                }
               else if(r2.isChecked())
                {
                    ++Quiz.score;
                }
                else
                {
                    --Quiz.score;
                }

                Intent i=new Intent(Quiz2.this,Quiz3.class);
                startActivity(i);
                finish();

            }
        });





    }
}
