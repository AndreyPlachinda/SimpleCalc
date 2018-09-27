

package com.example.andreyplachinda.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class MainActivity extends AppCompatActivity {
    TextView screenView;
    double carrentValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);

        screenView = (TextView) findViewById(R.id.screen);

        button0.setOnClickListener((v) -> {numberClick(0);});
        button1.setOnClickListener((v) -> {numberClick(1);});
        button2.setOnClickListener((v) -> {numberClick(2);});
        button3.setOnClickListener((v) -> {numberClick(3);});
        button4.setOnClickListener((v) -> {numberClick(4);});
        button5.setOnClickListener((v) -> {numberClick(5);});
        button6.setOnClickListener((v) -> {numberClick(6);});
        button7.setOnClickListener((v) -> {numberClick(7);});
        button8.setOnClickListener((v) -> {numberClick(8);});
        button9.setOnClickListener((v) -> {numberClick(9);});

    }

    private void  numberClick(int number){
        carrentValue = carrentValue*10 + number;
        screenView.setText(String.valueOf(carrentValue));

    }


}
