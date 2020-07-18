package com.example.calculatoractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonSimp;
    Button buttonAdv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }
     public void initComponents(){

        buttonSimp = findViewById(R.id.buttonSimp);
        buttonAdv = findViewById(R.id.buttonAdv);
        buttonSimp.setOnClickListener(this);
        buttonAdv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonSimp:
                String packageContext;
                Intent start_SimpleCalculator_intent = new Intent( this, SimpleCalculator.class);
                startActivity(start_SimpleCalculator_intent);
                break;
            case R.id.buttonAdv:
                Intent start_AdvancedCalculator_intent = new Intent(this, AdvancedCalculator.class);
                startActivity(start_AdvancedCalculator_intent);
                break;
        }
    }
}