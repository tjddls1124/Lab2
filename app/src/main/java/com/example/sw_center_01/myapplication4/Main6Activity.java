package com.example.sw_center_01.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.R.attr.button;
import static android.R.attr.checkedButton;


public class Main6Activity extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3;
    TextView t1,t2;
    CheckBox c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b1= (Button)findViewById(R.id.button);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        e3 = (EditText)findViewById(R.id.editText3);
        t1 = (TextView)findViewById(R.id.textView6);
        t2 = (TextView)findViewById(R.id.textView7);
        c1 = (CheckBox)findViewById(R.id.checkBox);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String piz = e1.getText().toString();
                String spa = e2.getText().toString();
                String sal = e3.getText().toString();
                double result = Double.parseDouble(spa) *15000 + Double.parseDouble(piz)*13000 + Double.parseDouble(sal)*9000 ;

                if(c1.isChecked()==true) result = result * 0.9;

                int num = Integer.parseInt(spa)  + Integer.parseInt(piz) + Integer.parseInt(sal) ;
                t1.setText(""+num+"");
                t2.setText(""+result+"");
                result = 0;
            }
        });



    }
}