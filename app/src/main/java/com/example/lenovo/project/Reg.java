package com.example.lenovo.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reg extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        e1=(EditText)findViewById(R.id.editText8);
        e2=(EditText)findViewById(R.id.editText9);
        e3=(EditText)findViewById(R.id.editText10);

        b1=(Button)findViewById(R.id.button33);


       

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2,s3;
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();

                if(s1.equals("")||s2.equals("")||s3.equals(""))
                {
                    Toast.makeText(Reg.this, "Please fill all", Toast.LENGTH_SHORT).show();

                }

                else {
                    SQLiteDatabase data=openOrCreateDatabase("gh", MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student (name varchar,email varchar,password varchar)");
                    String s4="select * from student where name='"+s1+"' and email='"+s2+"'";
                    Cursor cursor=data.rawQuery(s4,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(Reg.this, "users exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into student values ('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(Reg.this, "Registered", Toast.LENGTH_SHORT).show();
                        Intent j=new Intent(Reg.this,MainActivity.class);
                        startActivity(j);
                        finish();
                    }

                }

            }
        });

    }
}



/*


package com.example.lenovo.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText4);
        e3=(EditText)findViewById(R.id.editText5);

        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Register.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2,s3;
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();

                if(s1.equals("")||s2.equals("")||s3.equals(""))
                {
                    Toast.makeText(Second.this, "Please fill all", Toast.LENGTH_SHORT).show();

                }

                else {
                    SQLiteDatabase data=openOrCreateDatabase("gh", MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student (name varchar,email varchar,password varchar)");
                    String s4="select * from student where name='"+s1+"' and email='"+s2+"'";
                    Cursor cursor=data.rawQuery(s4,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(Second.this, "users exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into student values ('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(Second.this, "Registered", Toast.LENGTH_SHORT).show();
                        Intent j=new Intent(Second.this,MainActivity.class);
                        startActivity(j);
                        finish();
                    }

                }

            }
        });

    }
}



*/
