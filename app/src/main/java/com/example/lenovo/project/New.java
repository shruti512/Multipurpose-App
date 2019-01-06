package com.example.lenovo.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class New extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;

    TextView t1,t2;

    static float s,j=0,g=0,i;
    static char c;
    Integer i1=0,i2=0;
    static String s1="",s2,s3,s4;
    public String fun()
    {
        //j=Integer.parseInt(s1);


        switch (c) {
            case '+':
                i = j;
                g = g + i;
                break;
            case '-':
                i = j;
                if (g == 0) {
                    g = i;
                } else {
                    g = g - i;
                }
                break;
            case '*':
                i = j;
                if (g == 0) {
                    g = 1;
                }
                g = i * g;
                break;
            case '/':
                i = j;
                int d = 0;
                if (g == 0) {
                    g = i;
                    d = 1;
                } else if (i != 0 && d != 1) {
                    g = g / i;

                } else {
                    String a = "error";
                    return a;
                }
                break;

            default:
                s3=String.valueOf(j);
                return s3;
            }

            j = 0;
        //s1="";
            return (Float.toString(g));
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        b1 =(Button)findViewById(R.id.button53);
        b2 =(Button)findViewById(R.id.button37);
        b3 =(Button)findViewById(R.id.button38);
        b4 =(Button)findViewById(R.id.button40);
        b5 =(Button)findViewById(R.id.button41);
        b6 =(Button)findViewById(R.id.button42);
        b7 =(Button)findViewById(R.id.button44);
        b8 =(Button)findViewById(R.id.button45);
        b9 =(Button)findViewById(R.id.button46);
        b10=(Button)findViewById(R.id.button48);
        b11=(Button)findViewById(R.id.button39);
        b12=(Button)findViewById(R.id.button43);
        b13=(Button)findViewById(R.id.button47);
        b14=(Button)findViewById(R.id.button50);
        b15=(Button)findViewById(R.id.button51);
        b16=(Button)findViewById(R.id.button49);

        b17=(Button)findViewById(R.id.button52);
        b18=(Button)findViewById(R.id.button36);
        t2=(TextView)findViewById(R.id.textView19);
        t1=(TextView)findViewById(R.id.textView18);



        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c=='/')
                {
                    j=j*100;
                }
                else
                {
                    j=j/100;
                }
                s1=s1+"%";
                t2.setText(s1);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j/=10;
                s4=Float.toString(j);
                t2.setText(s4);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"1";
                j=j*10+1;
                t2.setText(s1);
                i1=1;

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"2";
                j=j*10+2;
                t2.setText(s1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"3";
                j=j*10+3;
                t2.setText(s1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"4";
                j=j*10+4;
                t2.setText(s1);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"5";
                j=j*10+5;
                t2.setText(s1);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"6";
                j=j*10+6;
                t2.setText(s1);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"7";
                j=j*10+7;
                t2.setText(s1);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"8";
                j=j*10+8;
                t2.setText(s1);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"9";
                j=j*10+9;
                t2.setText(s1);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1+"0";
                j=j*10+0;
               t2.setText(s1);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                s2=fun();
                t1.setText(s2);

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c='+';
                s1=s1+"+";
                t2.setText(s1);
              s2=fun();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c='-';
                s1=s1+"-";
                t2.setText(s1);
                s2=fun();


            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c='*';
                s1=s1+"X";
                t2.setText(s1);
                s2=fun();

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c='/';
                s1=s1+"/";
                t2.setText(s1);
                s2=fun();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("");
                t1.setText("");
                s1="";
                s2="";
                j=0;
                i=0;
                g=0;

            }
        });



    }
}
