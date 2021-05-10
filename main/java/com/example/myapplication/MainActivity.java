package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void converte (View view){

        EditText digite =(EditText) findViewById(R.id.txt_valor);
        TextView textView =(TextView) findViewById(R.id.textView3);

        double n = Double.parseDouble(digite.getText().toString());

        //DecimalFormat d = new DecimalFormat("#.##");
        double tempF =/*Double.parseDouble(d.format*/(n*1.8 + 32);

        textView.setText(String.valueOf(tempF));

    }
}