package com.example.sw_center_01.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.button;


public class Main2Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cd1 = e1.getText().toString();
                double fd1 = Integer.parseInt(cd1) * 1.8 + 32;
                Toast.makeText(getApplicationContext(), "섭씨온도는 : "+ fd1 +"입니다.", Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fd2 = e2.getText().toString();
                double cd2 = (Integer.parseInt(fd2) -32) * 1.8;
                Toast.makeText(getApplicationContext(), "당신이 태어난 년도는 : "+ cd2 +"입니다.", Toast.LENGTH_SHORT).show();

            }
        });

    }


}

