package com.example.lenovo.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button34);
        b2=(Button)findViewById(R.id.button35);
        e1=(EditText)findViewById(R.id.editText11);
        e2=(EditText)findViewById(R.id.editText12);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Reg.class);
                startActivity(i);
                //finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2;
                s1=e1.getText().toString();
                s2=e2.getText().toString();

                if (s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill all", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("gh",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student(name varchar,email varchar,password varchar)");

                    String s3="select * from student where name='"+s1+"' and password='"+s2+"'";

                    Cursor cursor=data.rawQuery(s3,null);

                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(MainActivity.this, "Wait loading", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(MainActivity.this,Welcome.class);
                        startActivity(i);
                        //finish();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Mismatch...", Toast.LENGTH_SHORT).show();
                    }
                }


            }

        });
    }
}
