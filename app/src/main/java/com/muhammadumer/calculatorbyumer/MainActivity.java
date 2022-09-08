package com.muhammadumer.calculatorbyumer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button oneBTN,twoBTN,threeBTN,fourBTN,fiveBTN,sixBTN,sevenBTN,eightBTN,nineBTN,plusBTN,minusBTN,divideBTN,multiplyBTN,zeroBTN,clearBTN,dotBTN,resultBTN;
    EditText ed1;
    float res1,res2;
    boolean add,sub,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneBTN=(Button)findViewById(R.id.oneBTN);
        twoBTN=(Button)findViewById(R.id.twoBTN);
        threeBTN=(Button)findViewById(R.id.threeBTN);
        fourBTN=(Button)findViewById(R.id.fourBTN);
        fiveBTN=(Button)findViewById(R.id.fiveBTN);
        sixBTN=(Button)findViewById(R.id.sixBTN);
        sevenBTN=(Button)findViewById(R.id.sevenBTN);
        eightBTN=(Button)findViewById(R.id.eightBTN);
        nineBTN=(Button)findViewById(R.id.nineBTN);
        zeroBTN=(Button)findViewById(R.id.zeroBTN);
        multiplyBTN=(Button)findViewById(R.id.multiplyBTN);
        divideBTN=(Button)findViewById(R.id.divideBTN);
        plusBTN=(Button)findViewById(R.id.plusBTN);
        minusBTN=(Button)findViewById(R.id.minusBTN);
        resultBTN=(Button)findViewById(R.id.resultBTN);
        dotBTN=(Button)findViewById(R.id.dotBTN);
        clearBTN=(Button)findViewById(R.id.clearBTN);
        ed1=(EditText) findViewById(R.id.editText);
        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        fourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        fiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        sixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        sevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        eightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        nineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        zeroBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        dotBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+".");
            }
        });
        plusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null){
                    ed1.setText("");
                }
                else
                {
                    res1=Float.parseFloat(ed1.getText()+"");
                    add=true;
                    ed1.setText(null);
                }
            }
        });
        minusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null){
                    ed1.setText("");
                }
                else
                {
                    res1=Float.parseFloat(ed1.getText()+"");
                    sub=true;
                    ed1.setText(null);
                }
            }
        });
        multiplyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null){
                    ed1.setText("");
                }
                else
                {
                    res1=Float.parseFloat(ed1.getText()+"");
                    multiply=true;
                    ed1.setText(null);
                }
            }
        });
        divideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null){
                    ed1.setText("");
                }
                else
                {
                    res1=Float.parseFloat(ed1.getText()+"");
                    divide=true;
                    ed1.setText(null);
                }
            }
        });
        resultBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2=Float.parseFloat(ed1.getText()+"");
                if(add==true){
                    ed1.setText(res1+res2+"");
                    add=false;
                }
                if(sub==true){
                    ed1.setText(res1-res2+"");
                    sub=false;
                }
                if(multiply==true){
                    ed1.setText(res1*res2+"");
                    multiply=false;
                }
                if(divide==true){
                    ed1.setText(res1/res2+"");
                    divide=false;
                }
            }
        });
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
            }
        });

    }
}