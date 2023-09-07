package com.example.calculatorappvanduys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numericClick (View v){
        TextView displayPlace = findViewById(R.id.numDisplay);
        displayPlace.setText("");

        if (v.getId() == R.id.number1Button){
            displayPlace.setText("1");
        }else if (v.getId() == R.id.number2Button){
            displayPlace.setText("2");
        }else if (v.getId() == R.id.number3Button){
            displayPlace.setText("3");
        }else if (v.getId() == R.id.number4Button){
            displayPlace.setText("4");
        }else if (v.getId() == R.id.number5Button){
            displayPlace.setText("5");
        }else if (v.getId() == R.id.number6Button){
            displayPlace.setText("6");
        }else if (v.getId() == R.id.number7Button){
            displayPlace.setText("7");
        }else if (v.getId() == R.id.number8Button){
            displayPlace.setText("8");
        }else if (v.getId() == R.id.number9Button){
            displayPlace.setText("9");
        }else if (v.getId() == R.id.number0Button){
            displayPlace.setText("0");
        }
    }
}