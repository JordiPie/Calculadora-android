package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double a = 0;
    double b = 0;
    double equal = 0;
    TextView textView;
    Switch degrees;
    Operations op;
    Add add;
    Substract sub;
    Multiplication mult;
    Division div;
    Sin sin;
    Cos cos;
    Tan tan;
    boolean trigonometric = false;

    public void bt0(View v) {
        textView.setText(textView.getText()+"0");
    }
    public void bt1(View v) {
        textView.setText(textView.getText()+"1");
    }
    public void bt2(View v) {
        textView.setText(textView.getText()+"2");
    }
    public void bt3(View v) {
        textView.setText(textView.getText()+"3");
    }
    public void bt4(View v) {
        textView.setText(textView.getText()+"4");
    }
    public void bt5(View v) {
        textView.setText(textView.getText()+"5");
    }
    public void bt6(View v) {
        textView.setText(textView.getText()+"6");
    }
    public void bt7(View v) {
        textView.setText(textView.getText()+"7");
    }
    public void bt8(View v) {
        textView.setText(textView.getText()+"8");
    }
    public void bt9(View v) {
        textView.setText(textView.getText()+"9");
    }
    public void btComa(View v) {
        textView.setText(textView.getText()+".");
    }
    public void btAdd(View v) {
        a = Double.parseDouble(textView.getText().toString());
        op = new Add();
        add = (Add)op;
        textView.setText(" ");
    }
    public void btSub(View v) {
        a = Double.parseDouble(textView.getText().toString());
        op = new Substract();
        sub = (Substract) op;
        textView.setText(" ");
    }
    public void btMult(View v) {
        a = Double.parseDouble(textView.getText().toString());
        op = new Multiplication();
        mult = (Multiplication) op;
        textView.setText(" ");
    }
    public void btDiv(View v) {
        a = Double.parseDouble(textView.getText().toString());
        op = new Division();
        div = (Division) op;
        textView.setText(" ");
    }
    public void btSin(View v) {
        trigonometric=true;
        op = new Sin();
        sin = (Sin) op;
    }
    public void btCos(View v) {
        trigonometric=true;
        op = new Cos();
        cos = (Cos) op;
    }
    public void btTan(View v) {
        trigonometric=true;
        op = new Tan();
        tan = (Tan) op;
    }

    public void btEqual(View v) {
        if(trigonometric == false){
            b = Double.parseDouble(textView.getText().toString());
        }
        else{
            a = Double.parseDouble(textView.getText().toString());
            if(degrees.isChecked())
            { b = 1; }
            else
            { b = 0; }
            trigonometric=false;
        }
        equal = op.operation(a,b);
        textView.setText(String.valueOf(equal));
    }
    public void btAC(View v) {
        textView.setText(" ");
        a=0;
        b=0;
        trigonometric=false;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        degrees = (Switch)findViewById(R.id.degrees);

    }


}