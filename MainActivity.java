package com.example.devi.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity  {
    private Button sem2;
    private Button sem3;
    private Button sem4;
    private Button sem5;
    private Button sem6;
    private Button sem7;
    private Button sem8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sem2=(Button)findViewById(R.id.sem2);
        sem3=(Button)findViewById(R.id.sem3);
        sem4=(Button)findViewById(R.id.sem4);
        sem5=(Button)findViewById(R.id.sem5);
        sem6=(Button)findViewById(R.id.sem6);
        sem7=(Button)findViewById(R.id.sem7);
        sem8=(Button)findViewById(R.id.sem8);
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });
        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent1=new Intent(MainActivity.this,Activity2.class);
        startActivity(intent1);
    }
    public void openActivity3()
    {
        Intent intent2=new Intent(MainActivity.this,Activity3.class);
        startActivity(intent2);
    }
    public void openActivity4()
    {
        Intent intent3=new Intent(MainActivity.this,Activity4.class);
        startActivity(intent3);
    }
    public void openActivity5()
    {
        Intent intent4=new Intent(MainActivity.this,Activity5.class);
        startActivity(intent4);
    }
    public void openActivity6()
    {
        Intent intent2=new Intent(MainActivity.this,Activity6.class);
        startActivity(intent2);
    }
    public void openActivity7()
    {
        Intent intent3=new Intent(MainActivity.this,Activity7.class);
        startActivity(intent3);
    }
    public void openActivity8()
    {
        Intent intent4=new Intent(MainActivity.this,Activity8.class);
        startActivity(intent4);
    }
}
