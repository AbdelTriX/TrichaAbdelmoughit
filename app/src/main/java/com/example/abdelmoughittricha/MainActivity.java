package com.example.abdelmoughittricha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_reinitializer,btn_quitter,btn_afficher,color1,color2,color3;
    EditText number;
    TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_reinitializer=findViewById(R.id.r);
        btn_quitter=findViewById(R.id.q);
        btn_afficher=findViewById(R.id.a);
        number=findViewById(R.id.insert);
        color1=findViewById(R.id.color1);
        color2=findViewById(R.id.color2);
        color3=findViewById(R.id.color3);
        tv=findViewById(R.id.tv);


        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {


                    int Number = Integer.parseInt(number.getText().toString());
                    String s="";
                    for (int i=1;i<=10;i++) {
                        int r= Number*i;
                        s+=String.format(" %d * %d= %d \n",Number,i,r);
                        r=0;

                    }
                    tv.setText(s);


                }catch (NumberFormatException e){
                    btn_reinitializer.callOnClick();

                }

            }

        });



        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        btn_reinitializer.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                number.setText("");
                StringBuilder r = new StringBuilder();
                for (int i = 0; i <= 10 ; i++) {
                    r.append(String.format("? x %d = ? \n", i));
                }
                tv.setText(r.toString());
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