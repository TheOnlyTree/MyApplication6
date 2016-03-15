package com.example.yoyoyee.myapplication6;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button,button2;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=(Button)findViewById(R.id.button2);
        button=(Button)findViewById(R.id.button1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=(TextView)findViewById(R.id.textView);
                text.setText("OK2");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = (TextView) findViewById(R.id.textView);
                text.setText("OK1");
            }
        });
    }
    public void changer(View v){
        Intent cha=new Intent();

        cha.setClass(MainActivity.this, Main2Activity.class);
        startActivity(cha);
        MainActivity.this.finish();
    }
}


/*
     button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView input = (TextView)findViewById(R.id.textView);
                input.setText("Hello ");
            }
        });
        Intent intent = new Intent();
intent.setClass(TestExam001.this, TestExam002.class);
startActivity(intent);
TestExam001.this.finish();

        */