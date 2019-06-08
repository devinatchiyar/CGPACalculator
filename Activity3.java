package com.example.devi.cgpacalculator;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity implements OnClickListener
{
    //Defining the Views
    EditText Num1;
    EditText Num2;
    EditText Num3;
    Button Add;

    TextView Result;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        //Referring the Views
        Num1 = (EditText) findViewById(R.id.editText1);
        Num2 = (EditText) findViewById(R.id.editText2);
        Num3 = (EditText) findViewById(R.id.editText3);
        Add = (Button) findViewById(R.id.Add);

        Result = (TextView) findViewById(R.id.textView);

        // set a listener
        Add.setOnClickListener(this);

    }

    @Override
    public void onClick (View v)
    {

        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float result = 0;
        String answer;


        // check if the fields are empty
        if (TextUtils.isEmpty(Num1.getText().toString()) || TextUtils.isEmpty(Num2.getText().toString()))
            return;

        // read EditText and fill variables with numbers
        num1 = Float.parseFloat(Num1.getText().toString());
        num2 = Float.parseFloat(Num2.getText().toString());
        num3 = Float.parseFloat(Num3.getText().toString());

        // defines the button that has been clicked and performs the corresponding operation
        // write operation into oper, we will use it later for output
        result=((num1*26)+(num2*28)+(num3*27))/(26+28+27);
        answer=String.format("%.02f",result);
        // form the output line
        Result.setText("Your CGPA is "+answer);
    }
}

