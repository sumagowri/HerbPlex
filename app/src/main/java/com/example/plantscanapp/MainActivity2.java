package com.example.plantscanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView,textView2,textView3;
    //Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        String name = "Neem";
        String desc = "Neem is considered to be a pharmacy in its own right in India, where every part of the plant is used medicinally. It contains a number of medically active substances including  bitters and flavonoids. It is one of the most important detoxicants in Ayurvedic medicine.";
        String sol = "Extracts can be made from leaves and other tissues, but the seeds contain the highest concentrations of the compound . It acts as an insect repellent, inhibiting feeding, and disrupting insect growth.";
        textView.setText(name);
        textView2.setText(desc);
        textView3.setText(sol);
    }
}