package com.example.sw_center_01.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.button;


public class Main6Activity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3= (Button)findViewById(R.id.button3);
        b4= (Button)findViewById(R.id.button3);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = e1.getText().toString();
                String v2 = e2.getText().toString();
                double result = Integer.parseInt(v1) + Integer.parseInt(v2);
                Toast.makeText(getApplicationContext(), "결과는 : "+ result +"입니다.", Toast.LENGTH_SHORT).show();
                result = 0;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = e1.getText().toString();
                String v2 = e2.getText().toString();
                double result = Integer.parseInt(v1) - Integer.parseInt(v2);
                Toast.makeText(getApplicationContext(), "결과는 : "+ result +"입니다.", Toast.LENGTH_SHORT).show();
                result = 0;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = e1.getText().toString();
                String v2 = e2.getText().toString();
                double result = Integer.parseInt(v1) * Integer.parseInt(v2);
                Toast.makeText(getApplicationContext(), "결과는 : "+ result +"입니다.", Toast.LENGTH_SHORT).show();
                result = 0;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = e1.getText().toString();
                String v2 = e2.getText().toString();
                double result = Integer.parseInt(v1) / Integer.parseInt(v2);
                Toast.makeText(getApplicationContext(), "결과는 : "+ result +"입니다.", Toast.LENGTH_SHORT).show();
                result = 0;
            }
        });

    }


}
