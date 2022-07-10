package com.example.calrate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ct1,ct2,ct3,ct4,ct5,wt1,wt2,wt3,wt4,wt5,rt1,rt2,rt3,rt4,rt5,rpp1,rpp2,rpp3,rpp4,rpp5;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ct1=findViewById(R.id.c1);
        ct2=findViewById(R.id.c2);
        ct3=findViewById(R.id.c3);
        ct4=findViewById(R.id.c4);
        ct5=findViewById(R.id.c5);

        wt1=findViewById(R.id.w1);
        wt2=findViewById(R.id.w2);
        wt3=findViewById(R.id.w3);
        wt4=findViewById(R.id.w4);
        wt5=findViewById(R.id.w5);

        rt1=findViewById(R.id.r1);
        rt2=findViewById(R.id.r2);
        rt3=findViewById(R.id.r3);
        rt4=findViewById(R.id.r4);
        rt5=findViewById(R.id.r5);

        rpp1=findViewById(R.id.rp1);
        rpp2=findViewById(R.id.rp2);
        rpp3=findViewById(R.id.rp3);
        rpp4=findViewById(R.id.rp4);
        rpp5=findViewById(R.id.rp5);

        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calRte();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Clr();
            }
        });
    }

    public void calRte() {
        int x1, x2, x3, x4, x5, y1, y2, y3, y4, y5, z1, z2, z3, z4, z5;
        double r1, r2, r3, r4, r5;
        x1 = Integer.parseInt(ct1.getText().toString());
        x2 = Integer.parseInt(ct2.getText().toString());
        x3 = Integer.parseInt(ct3.getText().toString());
        x4 = Integer.parseInt(ct4.getText().toString());
        x5 = Integer.parseInt(ct5.getText().toString());

        y1 = Integer.parseInt(wt1.getText().toString());
        y2 = Integer.parseInt(wt2.getText().toString());
        y3 = Integer.parseInt(wt3.getText().toString());
        y4 = Integer.parseInt(wt4.getText().toString());
        y5 = Integer.parseInt(wt5.getText().toString());

        z1 = Integer.parseInt(rt1.getText().toString());
        z2 = Integer.parseInt(rt2.getText().toString());
        z3 = Integer.parseInt(rt3.getText().toString());
        z4 = Integer.parseInt(rt4.getText().toString());
        z5 = Integer.parseInt(rt5.getText().toString());

        r1 = (double) z1 / (x1 * y1);
        rpp1.setText(String.valueOf(r1));
        r2 = (double) z2 / (x2 * y2);
        rpp2.setText(String.valueOf(r2));
        r3 = (double) z3 / (x3 * y3);
        rpp3.setText(String.valueOf(r3));
        r4 = (double) z4 / (x4 * y4);
        rpp4.setText(String.valueOf(r4));
        r5 = (double) z5 / (x5 * y5);
        rpp5.setText(String.valueOf(r5));
    }
    public void Clr(){
        ct1.setText("");
        ct2.setText("");
        ct3.setText("");
        ct4.setText("");
        ct5.setText("");

        wt1.setText("");
        wt2.setText("");
        wt3.setText("");
        wt4.setText("");
        wt5.setText("");

        rt1.setText("");
        rt2.setText("");
        rt3.setText("");
        rt4.setText("");
        rt5.setText("");

        rpp1.setText("");
        rpp2.setText("");
        rpp3.setText("");
        rpp4.setText("");
        rpp5.setText("");
    }
}