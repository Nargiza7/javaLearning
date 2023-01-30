package com.nargi.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText numbertext1;
    EditText numbertext2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbertext1 = findViewById(R.id.numbertext1);
        numbertext2 = findViewById(R.id.numbertext2);
        resultText = findViewById(R.id.resultText);


    }

    public void Toplama(View view) {
        if (numbertext1.getText().toString().matches("") || numbertext2.getText().toString().matches("")) {
            resultText.setText("Enter Number");

        } else {

            int number1 = Integer.parseInt(numbertext1.getText().toString());
            int number2 = Integer.parseInt(numbertext2.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result:" + result);
        }
    }

    public void Cikarma(View view) {
        if (numbertext1.getText().toString().matches("") || numbertext2.getText().toString().matches("")) {
            resultText.setText("Enter Number");

        } else {
            int number1 = Integer.parseInt(numbertext1.getText().toString());
            int number2 = Integer.parseInt(numbertext2.getText().toString());
            int result = number1 - number2;
            resultText.setText("Result:" + result);
        }
    }

    public void Carpma(View view) {
        if (numbertext1.getText().toString().matches("") || numbertext2.getText().toString().matches("")) {
            resultText.setText("Enter Number");

        } else {
            int number1 = Integer.parseInt(numbertext1.getText().toString());
            int number2 = Integer.parseInt(numbertext2.getText().toString());
            int result = number1 * number2;
            resultText.setText("Result:" + result);
        }
    }

    public void Bolme(View view) {
        if (numbertext1.getText().toString().matches("") || numbertext2.getText().toString().matches("")) {
            resultText.setText("Enter Number");

        } else {
            double number1 = Double.parseDouble(numbertext1.getText().toString());
            double number2 = Double.parseDouble(numbertext2.getText().toString());
            double result = number1 / number2;
            resultText.setText("Result:" + result);

        }

    }
}