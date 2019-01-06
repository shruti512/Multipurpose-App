package com.example.lenovo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Searchview extends AppCompatActivity {
    Button b1,b2;
    EditText t;
    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchview);
    b1=(Button)findViewById(R.id.button19);
        b2=(Button)findViewById(R.id.button20);
        t=(EditText)findViewById(R.id.editText6);
        w1=(WebView)findViewById(R.id.webview);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Searchview.this,Second.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=t.getText().toString();
                w1.loadUrl(s);

            }
        });


    }
}
