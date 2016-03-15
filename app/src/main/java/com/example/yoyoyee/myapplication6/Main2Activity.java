package com.example.yoyoyee.myapplication6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.concurrent.BrokenBarrierException;

public class Main2Activity extends AppCompatActivity {

    RadioGroup back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        back=(RadioGroup)findViewById(R.id.backGroup);
    }
    public void changer2(View v){
        if (back.getCheckedRadioButtonId()==R.id.radioButton_mid) {
            Intent cha = new Intent();
            cha.setClass(Main2Activity.this, MainActivity.class);
            startActivity(cha);
            Main2Activity.this.finish();
        }
    }
    public void changerRadio(View v){
        Button but =(Button)findViewById(R.id.button3);
        RadioButton out =(RadioButton)findViewById(back.getCheckedRadioButtonId());
        but.setText(out.getText());
    }
}
