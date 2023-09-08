package com.example.calculatorappvanduys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayPlace;
    String firstNumberInDaBox = "";
    String secondNumberInDaBox = "";
    boolean onSecondNum = false;
    String whichSymbol = "";
    Integer firstNum;
    Integer secondNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayPlace = findViewById(R.id.numDisplay);
        displayPlace.setText("");
    }


    public void numericClick (View v){

        if (!onSecondNum){
            if (v.getId() == R.id.number1Button){
                displayPlace.setText(firstNumberInDaBox + "1");
                firstNumberInDaBox = firstNumberInDaBox + "1";
            }else if (v.getId() == R.id.number2Button){
                displayPlace.setText(firstNumberInDaBox + "2");
                firstNumberInDaBox = firstNumberInDaBox + "2";
            }else if (v.getId() == R.id.number3Button){
                displayPlace.setText(firstNumberInDaBox + "3");
                firstNumberInDaBox = firstNumberInDaBox + "3";
            }else if (v.getId() == R.id.number4Button){
                displayPlace.setText(firstNumberInDaBox + "4");
                firstNumberInDaBox = firstNumberInDaBox + "4";
            }else if (v.getId() == R.id.number5Button){
                displayPlace.setText(firstNumberInDaBox + "5");
                firstNumberInDaBox = firstNumberInDaBox + "5";
            }else if (v.getId() == R.id.number6Button){
                displayPlace.setText(firstNumberInDaBox + "6");
                firstNumberInDaBox = firstNumberInDaBox + "6";
            }else if (v.getId() == R.id.number7Button){
                displayPlace.setText(firstNumberInDaBox + "7");
                firstNumberInDaBox = firstNumberInDaBox + "7";
            }else if (v.getId() == R.id.number8Button){
                displayPlace.setText(firstNumberInDaBox + "8");
                firstNumberInDaBox = firstNumberInDaBox + "8";
            }else if (v.getId() == R.id.number9Button){
                displayPlace.setText(firstNumberInDaBox + "9");
                firstNumberInDaBox = firstNumberInDaBox + "9";
            }else if (v.getId() == R.id.number0Button){
                displayPlace.setText(firstNumberInDaBox + "0");
                firstNumberInDaBox = firstNumberInDaBox + "0";
            }
        } else {
            if (v.getId() == R.id.number1Button){
                displayPlace.setText(secondNumberInDaBox + "1");
                secondNumberInDaBox = secondNumberInDaBox + "1";
            }else if (v.getId() == R.id.number2Button){
                displayPlace.setText(secondNumberInDaBox + "2");
                secondNumberInDaBox = secondNumberInDaBox + "2";
            }else if (v.getId() == R.id.number3Button){
                displayPlace.setText(secondNumberInDaBox + "3");
                secondNumberInDaBox = secondNumberInDaBox + "3";
            }else if (v.getId() == R.id.number4Button){
                displayPlace.setText(secondNumberInDaBox + "4");
                secondNumberInDaBox = secondNumberInDaBox + "4";
            }else if (v.getId() == R.id.number5Button){
                displayPlace.setText(secondNumberInDaBox + "5");
                secondNumberInDaBox = secondNumberInDaBox + "5";
            }else if (v.getId() == R.id.number6Button){
                displayPlace.setText(secondNumberInDaBox + "6");
                secondNumberInDaBox = secondNumberInDaBox + "6";
            }else if (v.getId() == R.id.number7Button){
                displayPlace.setText(secondNumberInDaBox + "7");
                secondNumberInDaBox = secondNumberInDaBox + "7";
            }else if (v.getId() == R.id.number8Button){
                displayPlace.setText(secondNumberInDaBox + "8");
                secondNumberInDaBox = secondNumberInDaBox + "8";
            }else if (v.getId() == R.id.number9Button){
                displayPlace.setText(secondNumberInDaBox + "9");
                secondNumberInDaBox = secondNumberInDaBox + "9";
            }else if (v.getId() == R.id.number0Button){
                displayPlace.setText(secondNumberInDaBox + "0");
                secondNumberInDaBox = secondNumberInDaBox + "0";
            }
        }

    }

    public void doMath(View v){
        firstNum = Integer.valueOf(firstNumberInDaBox);
        onSecondNum = true;

        if (v.getId() == R.id.plusButton){
            whichSymbol = "+";
        }
    }

    public void calculate(View v){
        secondNum = Integer.valueOf(secondNumberInDaBox);
        int result = firstNum + secondNum;

        displayPlace.setText(result+"");
    }
}