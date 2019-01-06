package com.example.lenovo.project;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sms extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
    b1=(Button)findViewById(R.id.button9);
        b2=(Button)findViewById(R.id.button10);
        e1=(EditText)findViewById(R.id.editText4);
        e2=(EditText)findViewById(R.id.editText5);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1=new Intent(Sms.this,Second.class);
                startActivity(i1);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2;
                s1=e1.getText().toString();
                s2=e2.getText().toString();

                Intent i=new Intent(getApplicationContext(),Sms.class);
                PendingIntent pi=PendingIntent.getActivity(getApplicationContext(),0,i,0);
                SmsManager sm=SmsManager.getDefault();
                sm.sendTextMessage(s1,null,s2,pi,null);
                Toast.makeText(Sms.this, "message sent successfully", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
