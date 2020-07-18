package com.example.calculatoractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdvancedCalculator extends AppCompatActivity implements View.OnClickListener{

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonMode;
    Button buttonMean;
    Button buttonMedian;
    Button buttonComma;
    Button buttonDot;
    Button buttonEqual;
    Button buttonBack;
    Button buttonC;
    EditText EditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_calculator);
        initComponents();
    }
    public void initComponents() {
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDot = findViewById(R.id.buttonDot);
        buttonMode = findViewById(R.id.buttonMode);
        buttonMean = findViewById(R.id.buttonMean);
        buttonMedian = findViewById(R.id.buttonMedian);
        buttonComma = findViewById(R.id.buttonComma);
        buttonEqual = findViewById(R.id.buttoneql);
        buttonBack = findViewById(R.id.buttonBack);
        buttonC = findViewById(R.id.buttonC);
        EditText = findViewById(R.id.edt1);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonMode.setOnClickListener(this);
        buttonMean.setOnClickListener(this);
        buttonMedian.setOnClickListener(this);
        buttonComma.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonBack.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1:
                EditText.setText(EditText.getText() + "1");
                break;
            case R.id.button2:
                EditText.setText(EditText.getText() + "2");
                break;
            case R.id.button3:
                EditText.setText(EditText.getText() + "3");
                break;
            case R.id.button4:
                EditText.setText(EditText.getText() + "4");
                break;
            case R.id.button5:
                EditText.setText(EditText.getText() + "5");
                break;
            case R.id.button6:
                EditText.setText(EditText.getText() + "6");
                break;
            case R.id.button7:
                EditText.setText(EditText.getText() + "7");
                break;
            case R.id.button8:
                EditText.setText(EditText.getText() + "8");
                break;
            case R.id.button9:
                EditText.setText(EditText.getText() + "9");
                break;
            case R.id.button0:
                EditText.setText(EditText.getText() + "0");
                break;
            case R.id.buttonDot:
                EditText.setText(EditText.getText() + ".");
                break;
            case R.id.buttonMode:
                break;
            case R.id.buttonMean:
                break;
            case R.id.buttonMedian:
                break;
            case R.id.buttonComma:
                EditText.setText(EditText.getText() + ",");
                break;

            case R.id.buttonC:
                EditText.setText("");
                break;
            case R.id.buttonBack:
                Intent packageContext;
                Intent start_MainActivity_intent = new Intent( this, MainActivity.class);
                startActivity(start_MainActivity_intent);
                break;
        }
    }





}
