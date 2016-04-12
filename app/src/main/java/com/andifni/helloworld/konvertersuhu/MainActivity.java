package com.andifni.helloworld.konvertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputTxt;
    TextView outputTxt;
    TextView labelTxt;
    RadioButton celcius;
    RadioButton fahrenheit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTxt = (EditText) findViewById(R.id.input_txt);
        outputTxt = (TextView) findViewById(R.id.output_txt);
        labelTxt = (TextView) findViewById(R.id.label_txt);
        celcius = (RadioButton) findViewById(R.id.celcius);
        fahrenheit = (RadioButton) findViewById(R.id.fahrenheit);
    }

    public void convertBtn(View v) {

        double input = Double.parseDouble(inputTxt.getText().toString());
        double output = 0;

        if (celcius.isChecked()) {
            labelTxt.setText("Fahrenheit");
            output = input * 9 / 5 + 32;
        } else {
            labelTxt.setText("Celcius");
            output = (input - 32) * 5 / 9;
        }

        outputTxt.setText(output + "");

    }
}
