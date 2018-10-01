package com.example.jacek.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void multiplyButtonPressed(View view) {
        TextView operator = (TextView)findViewById(R.id.textViewOperator);
        operator.setTextColor(Color.WHITE);
        operator.setBackgroundColor(Color.RED);
        operator.setText("*");
    }

    public void plusButtonPressed(View view) {
        TextView operator = (TextView)findViewById(R.id.textViewOperator);
        operator.setTextColor(Color.WHITE);
        operator.setBackgroundColor(Color.MAGENTA);
        operator.setText("+");
    }

    public void minusButtonPressed(View view) {
        TextView operator = (TextView)findViewById(R.id.textViewOperator);
        operator.setTextColor(Color.RED);
        operator.setBackgroundColor(Color.BLACK);
        operator.setText("-");
    }

    public void divideButtonPressed(View view) {
        TextView operator = (TextView)findViewById(R.id.textViewOperator);
        operator.setTextColor(Color.YELLOW);
        operator.setBackgroundColor(Color.BLACK);
        operator.setText("/");
    }

    public void calculateButtonPressed(View view) {
        EditText firstOperand = (EditText)findViewById(R.id.editTextFirstOperand);
        EditText secondOperand = (EditText)findViewById(R.id.editTextSecondOperand);
        TextView operator = (TextView)findViewById(R.id.textViewOperator);
        TextView result = (TextView)findViewById(R.id.textViewResult);

        String firstOperandString = firstOperand.getText().toString();
        String secondOperandString = secondOperand.getText().toString();
        String operatorString = operator.getText().toString();

        double firstOperandDouble = Double.parseDouble(firstOperandString);
        double secondOperandDouble = Double.parseDouble(secondOperandString);

        double value = 0.0;
        switch (operatorString)
        {
            case "/":
                value = firstOperandDouble / secondOperandDouble;
                result.setText(Double.toString(value));
                break;
            case "*":
                value = firstOperandDouble * secondOperandDouble;
                result.setText(Double.toString(value));
                break;
            case "-":
                value = firstOperandDouble - secondOperandDouble;
                result.setText(Double.toString(value));
                break;
            case "+":
                value = firstOperandDouble + secondOperandDouble;
                result.setText(Double.toString(value));
                break;
            default:
                break;
        }





    }
}
