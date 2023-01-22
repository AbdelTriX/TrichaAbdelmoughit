package com.example.abdelmoughittricha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_reinitializer,btn_quitter,color1,color2,color3;
    EditText number;
    TextView textview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_reinitializer=findViewById(R.id.r);
        btn_quitter=findViewById(R.id.q);
        number=findViewById(R.id.insert);
        color1=findViewById(R.id.color1);
        color2=findViewById(R.id.color2);
        color3=findViewById(R.id.color3);

        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        btn_reinitializer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(null);
            }
        });

        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.DKGRAY);
            }
        });
        color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.BLUE);
            }
        });
        color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.GRAY);
            }
        });


    }
    public void setMyScreenColor(int color) {
        View v = this.getWindow().getDecorView();
        v.setBackgroundColor(color);
    }
}