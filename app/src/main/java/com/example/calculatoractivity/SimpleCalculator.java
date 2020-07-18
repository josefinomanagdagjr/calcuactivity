package com.example.calculatoractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SimpleCalculator extends AppCompatActivity implements View.OnClickListener{

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
    Button buttonAdd;
    Button buttonSub;
    Button buttonDiv;
    Button buttonMul;
    Button buttonDot;
    Button buttonEqual;
    Button buttonBack;
    Button buttonC;
    EditText EditText;

    float num1, num2;

    boolean Addition, Subtraction, Multiplication, Division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
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
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDiv = findViewById(R.id.buttondiv);
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
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
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
            case R.id.buttonadd:
                if (EditText == null) {
                    EditText.setText("");
                } else {
                    num1 = Float.parseFloat(EditText.getText() + "");
                    Addition = true;
                    EditText.setText(null);
                }
                break;
            case R.id.buttonsub:
                if (EditText == null) {
                    EditText.setText("");
                } else {
                    num1 = Float.parseFloat(EditText.getText() + "");
                    Subtraction = true;
                    EditText.setText(null);
                }
                break;
            case R.id.buttonmul:
                if (EditText == null) {
                    EditText.setText("");
                } else {
                    num1 = Float.parseFloat(EditText.getText() + "");
                    Multiplication = true;
                    EditText.setText(null);
                }
                break;
            case R.id.buttondiv:
                if (EditText == null) {
                    EditText.setText("");
                } else {
                    num1 = Float.parseFloat(EditText.getText() + "");
                    Division = true;
                    EditText.setText(null);
                }
                break;
            case R.id.buttoneql:
                num2 = Float.parseFloat(EditText.getText() + "");

                if (Addition == true) {
                    EditText.setText(num1 + num2 + "");
                    Addition = false;
                }

                if (Subtraction == true) {
                    EditText.setText(num1 - num2 + "");
                    Subtraction = false;
                }

                if (Multiplication == true) {
                    EditText.setText(num1 * num2 + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    EditText.setText(num1 / num2 + "");
                    Division = false;
                }
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
