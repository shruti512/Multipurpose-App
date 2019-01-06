package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cal extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    EditText e1,e2;
    TextView t1;
    String s1,s2,res;
    Integer i,i2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);
        b1=(Button)findViewById(R.id.button7);
        b2=(Button)findViewById(R.id.button14);
        b3=(Button)findViewById(R.id.button15);
        b4=(Button)findViewById(R.id.button16);
        b5=(Button)findViewById(R.id.button18);
        b6=(Button)findViewById(R.id.button13);

        b7=(Button)findViewById(R.id.button17);
        t1=(TextView)findViewById(R.id.textView16);
        e1=(EditText)findViewById(R.id.editText13);
        e2=(EditText)findViewById(R.id.editText14);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                sum=i+i2;
                res=Integer.toString(sum);
                t1.setText(res);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                sum=i-i2;
                res=Integer.toString(sum);
                t1.setText(res);
                //Toast.makeText(Third.this, "Answer is"+res, Toast.LENGTH_SHORT).show();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                sum=i/i2;
                res=Integer.toString(sum);
                t1.setText(res);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                sum=i*i2;
                res=Integer.toString(sum);
                t1.setText(res);


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Cal.this,Second.class);
                startActivity(i);
                finish();

            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });
    }
}
