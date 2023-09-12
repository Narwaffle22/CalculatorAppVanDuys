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
    boolean newIteration = true;
    boolean isPos = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayPlace = findViewById(R.id.numDisplay);
        displayPlace.setText("");
    }


    public void numericClick (View v){

        if (newIteration){
            firstNumberInDaBox = "";
            newIteration = false;
        }

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
        } else if (v.getId() == R.id.minusButton){
            whichSymbol = "-";
        } else if (v.getId() == R.id.multiplicationButton){
            whichSymbol = "*";
        } else if (v.getId() == R.id.divisionButton){
            whichSymbol = "/";
        }
    }

    public void calculate(View v){
        if (onSecondNum){
            secondNum = Integer.valueOf(secondNumberInDaBox);
            int result = 0;
            double divideResult = 0;
            if (whichSymbol.equals("+")){
                result = firstNum + secondNum;
            } else if (whichSymbol.equals("-")){
                result = firstNum - secondNum;
            } else if (whichSymbol.equals("*")){
                result = firstNum * secondNum;
            } else if (whichSymbol.equals("/")){
                divideResult = (double) firstNum / secondNum;
            }

            if (whichSymbol.equals("/")){
                displayPlace.setText(divideResult+"");
                firstNumberInDaBox = divideResult + "";
            } else {
                displayPlace.setText(result+"");
                firstNumberInDaBox = result + "";
            }


            if (result > 0 || divideResult > 0){
                isPos = true;
            } else {
                isPos = false;
            }
            onSecondNum = false;
            secondNumberInDaBox = "";
            newIteration = true;
        }

    }

    public void posNeg(View v){
        if (isPos){
            if (!onSecondNum){
                firstNumberInDaBox = "-" + firstNumberInDaBox;
                displayPlace.setText(firstNumberInDaBox);
            }else if (onSecondNum){
                secondNumberInDaBox = "-" + secondNumberInDaBox;
                displayPlace.setText(secondNumberInDaBox);
            }
            isPos = false;
        } else {
            if (!onSecondNum){
                firstNumberInDaBox = firstNumberInDaBox.substring(firstNumberInDaBox.indexOf("-") + 1, firstNumberInDaBox.length());
                displayPlace.setText(firstNumberInDaBox);
            }else if (onSecondNum){
                secondNumberInDaBox = secondNumberInDaBox.substring(secondNumberInDaBox.indexOf("-") + 1, secondNumberInDaBox.length());
                displayPlace.setText(secondNumberInDaBox);
            }
            isPos= true;
        }
    }

    public void clearAll(View v){
        firstNumberInDaBox = "";
        secondNumberInDaBox = "";
        displayPlace.setText("0");
        onSecondNum = false;
    }
}